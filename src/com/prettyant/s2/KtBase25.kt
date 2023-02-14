package com.prettyant.s2

//TODO Kotlin语言的函数参数学习
fun main() {
    //第一步：函数输入输出的声明
    val methodAction: (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputValue = 999
        "$inputValue Prettyant 参数1:$number1 参数2:$number2 参数3:$number3"
    }
    println(methodAction(1, 2, 3))

    val methodAction2: (String, Int) -> String = { name, age ->
        "name: $name age:$age"
    }
    println(methodAction2("test",0))

}
/**
 * fun methodAction(number1 : Int,number2 : Int,number3 : Int):String{
 *      val inputValue = 999
"       return $inputValue Prettyant 参数1:$number1 参数2:$number2 参数3:$number3"
 * }
 */