package com.prettyant.s6

//TODO Kotlin语言的变换函数 [map]
fun main() {
    val list = listOf("孙悟空", "猪八戒", "唐僧")
    // T T T   新的集合(R R R)
    //原理: 就是把匿名函数 最后一行的返回值 加入一个新的集合  新的集合的泛型是R, 并且返回新的集合
    val list2: List<String> = list.map {
        //it == T == 元素 == String
        "[$it]"
//        88
    }
    println(list2)
    println("---------------换行---------------")
    //用途: 和RxJava的思路一模一样
    val list3 = list.map {
        "姓名是: $it"
    }.map {
        "$it ,文字的长度是${it.length}"
    }.map {
        "[$it]"
    }
    for (s in list3) {
        println("$s    ")
    }
    println("---------------换行22---------------")
    list.map {
        "姓名是: $it"
    }.map {
        "$it ,文字的长度是${it.length}"
    }.map {
        "[$it]"
    }.map {
        println("$it    ")
    }

}