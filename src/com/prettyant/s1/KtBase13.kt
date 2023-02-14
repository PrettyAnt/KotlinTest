package com.prettyant.s1


//  TODO kotlin 语言的range表达式

fun main() {
    val number = 148

    // range 范围  从哪里 到 哪里
    if (number in 10..59) {
        println("不及格")
    }else if (number in 0..9) {
        println("不及格并且分数很差")
    }else if (number in 60..100) {
        println("合格")
    }else if (number !in 0..100) {
        println("分数不在范围内")
    }
}