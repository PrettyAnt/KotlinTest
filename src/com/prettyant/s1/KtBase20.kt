package com.prettyant.s1


//  TODO kotlin语言的Nothing类型的特点

fun main() {
    show(-2)
}

private fun show(number: Int) {
    when (number) {
        -1 -> TODO("没有这种分数")//可以点进去看源码，"main" kotlin.NotImplementedError: An operation is not implemented:"
        in 0..50 -> println("分数不及格")
        in 60..70 -> println("分数及格")
        in 71..100 -> println("分数优秀")
    }

}

