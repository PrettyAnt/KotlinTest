package com.prettyant.s6

//TODO Kotlin语言的合并函数 [zip]
fun main() {
    val names = listOf("孙悟空", "孙行者", "猪八戒", "孙慧")
    val ages = listOf(999, 888, 666, 30)

    //RxJava zip合并操作符
    //KT 自带就有 zip 合并操作

    //就是把第一个集合  和 第二个集合合并,创建新集合并返回
    //  创建新的集合(元素  元素   元素)元素Pair(K,V) , K代表第一个集合的元素,V代表第二个集合的元素
    //
    val zip: List<Pair<String, Int>> = names.zip(ages)
    println(zip)
    println(zip.toMap())
    println(zip.toSet())
    println(zip.toList())
    println("----------")
    //遍历
    zip.forEach {

        //it === Pair<String,Int>

        println("姓名是:${it.first},年龄是:${it.second}")
    }
    println("-----map普通方式------")
    zip.toMap().forEach { k, v ->
        println("姓名是:$k,年龄是:$v")
    }
    println("-----map解构方式------")
    zip.toMap().forEach { (k, v) ->
        println("姓名是:$k,年龄是:$v")
    }
    println()
    zip.toMap().forEach {
        //it == Map的元素  每一个元素都有k和v    Map.Entry<String,Int>
        //it == Map.Entry<String,Int>
        println("${it.key},${it.value}")
    }
}