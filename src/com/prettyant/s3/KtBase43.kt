package com.prettyant.s2

const val INFO = "PrettyAnt is Success Result"

//TODO Kotlin语言的subString  两种方式
fun main() {
    val indexOf = INFO.indexOf('l')
    println(INFO.substring(0, indexOf))
    println(INFO.substring(0 until indexOf))
}


