package com.prettyant.s3

//TODO Kotlin语言的数字类型的安全转换函数
fun main() {
    val number: Int = "666".toInt()
    println(number)

    //java.lang.NumberFormatException
//    val number2: Int = "666.66".toInt()
//    println(number2)
    //解决方案
    val number3: Int? = "888.88".toIntOrNull()
    println(number3)

    val number4: Int? = "888.88".toIntOrNull()
    println(number4 ?: "number4 转换的结果为空")

    //小结: 以后字符串有相关的操作，尽量用toIntOrNull函数
}



