package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的Set创建与元素获取
// 1.Set定义 不允许重复
// 2.普通方式elementAt 会越界奔溃
// 3.elementAtOrElse elementAtOrNull
fun main() {
    val set: Set<String> = setOf("ppd", "卢本伟", "五五开", "uu妹", "doinb", "doinb")//set集合不会出现重复元素的
    println(set)
    //set[0]  ❌ 没有这样的功能，去set集合元素
    println(set.elementAt(0))
    println(set.elementAt(1))
    println(set.elementAt(2))
    println(set.elementAt(3))
    println(set.elementAt(4))
//    println(set.elementAt(5))  越界
    println("-------------")
    //处理越界   尽量使用此方式
    println(set.elementAtOrElse(0) { "越界了" })
    println(set.elementAtOrElse(5) { "越界了" })
    println(set.elementAtOrNull(0))
    println(set.elementAtOrNull(5) ?: "你越界了")

}