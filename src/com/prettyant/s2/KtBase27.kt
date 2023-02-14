package com.prettyant.s2

//TODO Kotlin语言的匿名函数的类型推断
fun main() {
    //匿名函数，类型推断为String
    //方法名后 有冒号: 必须指定参数类型  和 返回类型
    //方法名 = 类型推断返回类型
    val method1 = { v1: Double, v2: Float, v3: Int ->
        "自动推断出了类型 v1:$v1 v2:$v2 v3:$v3"
//        123   //自动推断为int类型
//        false //自动推断为boolean类型
    } //相当于 fun method1 (v1:Double,v2:Float,v3:Int)->String{    }
    println(method1(55.3, 88f, 18))

    //-------------------------------------------------
    val a1: (v1: Double, v2: Float, v3: Int) -> String = { v1: Double, v2: Float, v3: Int ->
        "原型为: $v1,$v2,$v3"
    }
    println(a1(55.4, 99f, 19))


    //---------------------------------------------
    val method2 = {
    }
    //相当于 method2() -> Unit
    println(method2())

    /*
     fun method4(name: String, age: Float): String {
          return "name:$name age:$age"
      }
      println(method4("prettyant", 29f))
      */

    val method3 = { number: Int ->
        number
    }//相当于  method3(number:Int) -> return Int
    println(method3(16))

    val c3: (number: Int) -> Int = { number ->
        number
    }

    println("method3的原型为------>>>>" + c3(16))

    //1、一般函数
    fun hello(name: String): String {
        return "一般函数--->>> $name"
    }
    println(hello("你好"))
    //2、匿名函数
    val hello2: (String, Int) -> String = { name, age ->
        "匿名函数--->>> name:$name age:$age"
    }
    println(hello2("ComeOn", 100))
    //3、匿名函数类型推断
    val hello3 = { name: String, age: Int ->
        "匿名函数类型推断--->>> name:$name age$age"
    }
    println(hello3("prettyant", 29))

    //------------练习

    //一般函数
    fun test(age: Int): String {
        return "test --> 年龄：$age\n"
    }
    //匿名函数
    val test2: (Int) -> String = { age ->
        "test2 --> 年龄：$age\n"
    }

    //匿名函数类型推断
    val test3 = { age: Int ->
        "test3 --> 年龄：$age"
    }
    print(test(66)+ test2(77)+test3(88))

}
