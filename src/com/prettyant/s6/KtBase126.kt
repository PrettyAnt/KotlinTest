package com.prettyant.s6

//TODO Kotlin语言的过滤函数 [filter] 一般和flatMap联用
fun main() {
    println("126 - Kotlin语言的过滤函数 -filter")
    val nameLists = listOf(
        listOf("孙悟空", "孙行者", "猪八戒"),
        listOf("猪猪侠", "猪悟能", "白龙马"),
        listOf("白莲花", "唐僧", "唐太宗")
    )
    val result = nameLists.map { it ->
        //it == nameLists的元素 == listOf("孙悟空", "孙行者", "猪八戒")
        println(it)
    }
    nameLists.flatMap {
       it.filter {
           println("$it filter")//进来了9次
           false
           //filter true  false
           //true  会加入到新的集合,进行组装新集合
           //false 不加入,空集合
       }
    }.map {
        println(it)
    }
    println("-------------------------------")
    nameLists.map {
        it.filter {
            true
        }
    }.map {
        println("map:[$it]")// map:[[孙悟空, 孙行者, 猪八戒]] map:[[猪猪侠, 猪悟能, 白龙马]] map:[[白莲花, 唐僧, 唐太宗]]
    }
    println("-------------------------------")
    nameLists.flatMap { it ->
        it.filter {
            it.contains("孙")
        }
    }.map {
        println("flatMap:[$it]")//flatMap:[孙悟空] flatMap:[孙行者]   flatMap:[猪八戒]   flatMap:[猪猪侠]   flatMap:[猪悟能]   flatMap:[白龙马]   flatMap:[白莲花]   flatMap:[唐僧]    flatMap:[唐太宗]
    }

    //
}