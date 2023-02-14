package com.prettyant.s2

//TODO Kotlin语言的it关键字特点
fun main() {
    //第一步：函数输入输出的声明
    val methodAction: (Int, Int, Int) -> String = { n1, n2, n3 ->
        val number = 1234
        "$number Prettyant 参数1:$n1 参数2:$n2 参数3:$n3"
    }
    println(methodAction(1, 2, 3))
//    println(methodAction.invoke(4,5,6))

    val methodAction2: (String) -> String = {
        "$it  加油"
    }
    println(methodAction2("PrettyAnt666"))

    val methodAction3: (Double) -> String = {
        "$it  奥利给"
    }
    println(methodAction3(33009.5))
}

/**
 * fun methodAction2(it : String) : String{
 *      return "$it Hello"
 * }
 */