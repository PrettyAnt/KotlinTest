package com.prettyant.s3

import java.util.*

//TODO Kotlin语言的 == 与 === 比较操作的区别
fun main() {
    //== 值 内容的比较 相当于java的equals

    // === 引用的比较
    val name1 = "Prettyant"
    val name2 = "Prettyant"
    val name3 = "cc"

    //java 中的equals相当于 kt中的 ==
    println(name1.equals(name2))//java  true
    println(name1 == name2)//kt  true


    //引用的比较
    println(name1 === name2) //仍然为true   指向同一个字符串常量池，所以相等
    println(name1 === name3) //false

    //引用的比较
    val name4= "prettyant".replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println("值的比较 -->> "+(name4==name1))
    println("引用比较 -->> "+(name4===name1))


}



