package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:39 AM  20/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
// ----------------------只管消费者--------------------
class ConsumerClass1 : Consumer<Animal> {
    override fun consumer(item: Animal) {
        println("消费者: Animal()")
    }
}

class ConsumerClass2 : Consumer<Humanity> {
    override fun consumer(item: Humanity) {
        println("消费者: HUmanity()")
    }
}

class ConsumerClass3 : Consumer<Man> {
    override fun consumer(item: Man) {
        println("消费者: Man()")
    }
}

class ConsumerClass4 : Consumer<WoMan> {
    override fun consumer(item: WoMan) {
        println("消费者: WoMan()")
    }
}
//TODO Kotlin语言的 in - [逆变]学习
fun main() {
    val p1 : Consumer<Man> =ConsumerClass1()  //ConsumerClass1本来就是传递Animal   居然也可以   因为in
    val p2 : Consumer<WoMan> =ConsumerClass2()  //ConsumerClass2本来就是传递Humanity   居然也可以   因为in
    //默认情况下  泛型具体处的父类  是不可以赋值给  泛型声明处的子类的
    //in 泛型具体处的父类  是可以赋值给  泛型声明处的子类的

    //逆变: 子类  泛型声明处  可以接收   父类  泛型具体处
    //协变:out 父类  = 子类
    //逆变:in  子类  = 父类
}