package com.prettyant.s2

//TODO Kotlin语言的lambda学习
fun main() {

    //匿名函数等价于lamba表达式
    val addResultMethod = { number1: Int, number2: Int ->
        "两数相加的结果是:${number1 + number2}"
    }

    println(addResultMethod(18, 19))

    //原型:
    val addResultMethod1: (number1: Int, number2: Int) -> String = { number1: Int, number2: Int ->
        "两数相加的结果是:${number1 + number2}"
    }

    /**
     *   相当于  如下代码
     *   fun addResultMethod2(number1: Int, number2: Int): String {
     *      return "两数相加的结果是:${number1 + number2}"
     *   }
     *   println(addResultMethod2(20, 18))
     */

    //匿名函数   入参 Int,        返回 Any类型
    //lambda 表达式的参数 Int,    lambda表达式的结果Any类型
    val weekResultMethod = { numble: Int ->
        when (numble) {
            1 -> "星期1"
            2 -> "星期2"
            3 -> "星期3"
            4 -> "星期4"
            5 -> "星期5"
            else -> -1
        }
    }//weekResultMethod 函数：(Int)->Any
    println("result:"+weekResultMethod(7))
    val weekResultMethod1: (number: Int) -> Any = { number: Int ->
        when (number) {
            1 -> "星期1"
            2 -> "星期2"
            3 -> "星期3"
            4 -> "星期4"
            5 -> "星期5"
            else -> -1
        }
    }
    println("原型函数为: " + weekResultMethod1(7))


    //总结： 匿名函数属于lambda


    val method1 = { name: String, age: Int ->
        "相当于lambda--->>>name:$name age:$age"
    }
    println(method1("测试", 888))
}