package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的可变List集合学习
//可变的集合
//不可变集合 to 可变集合
//可变集合 to 不可变集合
fun main() {
    val list = mutableListOf("PrettyAnt", "BaoBao", "BeiBei", "FeiFei")
    list.add("张三")
    list.remove("PrettyAnt")
    println(list)

    //不可变集合 to 可变集合
    val list2 = listOf(123, 456, 789)
    //不可变的集合，无法完成可变的操作
//    list2.add
    //list2.remove

    //不可变集合 -->> 可变的集合
    val list3 = list2.toMutableList()// val list3: MutableList<Int> = list2.toMutableList()
    list3.add(888)
    list3.remove(456)
    println(list3)

    //可变集合 --->>> 不可变集合
    val list4: MutableList<Char> = mutableListOf('a', 'b', 'c')
    list4.add('y')
    list4.remove('a')
    println(list4)
    val list5: List<Char> = list4.toList()
//    list5.add

}