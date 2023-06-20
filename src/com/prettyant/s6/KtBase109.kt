package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 4:12 PM  19/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
//生产者  out T  协变[out T此泛型能够被获取  读取  所以是out]
interface Producer<out T> {
    // out  T 代表整个生产者里面  这个T只能被读取,不能被修改

    //不能被修改  (编译不通过)
//    fun consumer(item: T) /* {  消费代码 }*/  //todo

    //只能被读取
    fun producer(): T
}

//消费者  in T  逆变[in T 此泛型只能被修改  更新  所以是in]
interface Consumer<in T> {
    //只能被修改
    fun consumer(item: T) /* {  消费代码 }*/

    //不能被读取
//    fun producer(): T   // (编译不通过) todo
}

//生产者&消费者   T  默认情况下,是不变
interface ProducerAndConsumer<T> {
    //能被修改
    fun consumer(item: T) /* {  消费代码 }*/

    //能被读取
    fun producer(): T   //todo
}


open class Animal //动物
open class Humanity : Animal()//人类
open class Man : Humanity()//男人
open class WoMan : Humanity()//女人

// ----------------------只管生产者--------------------
class ProducerClass1 : Producer<Animal> {
    override fun producer(): Animal {
        println("生产者: Animal()")
        return Animal()
    }
}

class ProducerClass2 : Producer<Humanity> {
    override fun producer(): Humanity {
        println("生产者: HUmanity()")
        return Humanity()
    }
}

class ProducerClass3 : Producer<Man> {
    override fun producer(): Man {
        println("生产者: Man()")
        return Man()
    }
}

class ProducerClass4 : Producer<WoMan> {
    override fun producer(): WoMan {
        println("生产者: WoMan()")
        return WoMan()
    }
}

//TODO Kotlin语言的out  - [协变]学习
//  1.Producer Consumer 不变
//  2.ProducerClass4
//  3.main函数
fun main() {
    val p1: Producer<Animal> = ProducerClass1()//ProducerClass1本来就是传递Animal 当然是可以的
    val p2: Producer<Animal> = ProducerClass2()//ProducerClass1本来就是传递Humanity   居然也可以   因为out
    val p3: Producer<Animal> = ProducerClass3()//ProducerClass1本来就是传递Man   居然也可以   因为out
    val p4: Producer<Animal> = ProducerClass4()//ProducerClass1本来就是传递WoMan  居然也可以   因为out

    //泛型默认情况下是: 泛型的子类对象  不可以赋值给泛型的父类对象
    //泛型默认情况下是: 泛型具体处的子类对象  不可以赋值给 泛型声明处的对象

    //out : 泛型的子类对象  可以赋值给泛型的父类对象
    //out : 泛型具体出的子类对象,可以赋值给泛型声明处的父类对象

    //协变: 父类 泛型声明处  可以接收  子类  泛型具体处
}