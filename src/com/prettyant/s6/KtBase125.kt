package com.prettyant.s6

//TODO Kotlin语言的变换函数 [flatMap]  [可能讲的不对?]
//map {返回类型 : it == 每个元素 T String Int Boolean Char ... 是把每一个元素加入到集合,最后返回新集合List<List<String>>}
//flatMap{返回类型: it == 每一个元素 T 集合1 集合2 集合3 ... 是把每一个元素(集合)加入到新集合,最后返回新集合List<List<String>>}


//TODO flatMap 相当于List<List<String>>集合的集合,有嵌套关系
fun main() {
    val list: List<String> = listOf("孙悟空", "猪八戒", "唐僧")
    val newList :List<String> = list.map {
        "你的姓名是:$it"
    }.map {
        "$it,你的名字的长度为:${it.length}"
    }.flatMap {
        listOf("$it 在学习72变", "$it 在学习36变", "$it 在念紧箍咒")
    }

    println(newList)
    println("-----------------------------------")

    /*
      [你的姓名是:孙悟空,你的名字的长度为:9 在学习72变,
      你的姓名是:孙悟空,你的名字的长度为:9 在学习36变,
      你的姓名是:孙悟空,你的名字的长度为:9 在念紧箍咒,

      你的姓名是:猪八戒,你的名字的长度为:9 在学习72变,
      你的姓名是:猪八戒,你的名字的长度为:9 在学习36变,
      你的姓名是:猪八戒,你的名字的长度为:9 在念紧箍咒,

      你的姓名是:唐僧,你的名字的长度为:8 在学习72变,
      你的姓名是:唐僧,你的名字的长度为:8 在学习36变,
      你的姓名是:唐僧,你的名字的长度为:8 在念紧箍咒]
     */

    val newList2 = list.flatMap {
        listOf("($it)喝酒"," <$it>跳舞")
    }
    println(newList2)
    //todo 原理: 就是把匿名函数 最后一行的返回值(又是一个)加入一个新的集合,新集合的泛型R,并且返回新集合
}