package com.prettyant.s6

import com.prettyant.s6.com.prettyant.randomItemValue as g //as g 重命名扩展操作
import com.prettyant.s6.com.prettyant.randomItemValuePrintln as p//as p 重命名扩展操作

//TODO Kotlin语言的重命名扩展学习
fun main() {
    val list: List<String> = listOf("孙行者", "猪八戒", "唐僧")
    val set: Set<Double> = setOf(688.5, 666.5, 699.5)
    //如果不使用扩展文件
    println(list.shuffled().first())
    println(set.shuffled().first())
    println("---------自定义扩展文件实现-------------")
    //使用扩展文件
    println(list.g())
    println(set.g())
    println()
    list.p()
    set.p()
}