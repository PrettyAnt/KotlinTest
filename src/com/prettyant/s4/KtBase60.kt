package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的List集合遍历学习 3种方式
fun main() {
    val list = listOf("ppd", "卢本伟", "五五开", "uu妹", "doinb", "大司马")
    println(list)//输出list的详情，不是遍历

    //第一种  遍历方式
    for (i in list) {
        println("元素为: $i  ")
    }

    //第二种  遍历方式
    list.forEach {
        //it == 每一个元素
        println("每一个元素为： $it ")
    }
    println("--------------------")

    //第三种  遍历方式  下标
    list.forEachIndexed { index, i ->
        println("下标为: $index,元素为:$i")
    }
}