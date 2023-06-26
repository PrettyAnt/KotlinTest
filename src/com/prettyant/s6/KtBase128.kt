package com.prettyant.s6

//TODO Kotlin语言中使用函数式编程
fun main() {
    //1.定义names集合
    val names = listOf("孙悟空", "孙行者", "孙慧")
    //2.定义ages集合
    val ages = listOf(999, 888, 30)
    //3.合并以上两个集合
    //4.给集合添加详细内容,方便输出
    //5.输出最后的成功 结果
    val map = names.zip(ages).toMap().map {
        "you name is ${it.key},you age is ${it.value}"
    }.map {
        println(it)
    }
    println("----------")
    listOf("孙悟空", "孙行者", "孙慧")
        .zip(listOf(999, 888, 30))
        .toMap().map {
            println("you name is ${it.key},you age is ${it.value}")
        }

}