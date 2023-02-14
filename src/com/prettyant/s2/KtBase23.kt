package com.prettyant.s2

//TODO Kotlin语言匿名函数学习
fun main() {
    val len = "PrettyAnt".count()
    println(len)

   val len2="PrettyAnt".count {
       //it等价于 P r e t t y A n t 的字符 Char ,看起来像iterator？
       println("结果:"+it)
        it == 'r'
    }
    println(len2)
}