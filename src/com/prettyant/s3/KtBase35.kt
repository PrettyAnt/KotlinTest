package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO Kotlin语言的可空性特点
fun main() {
    //TODO 第一种情况：默认是不可空类型,不能随意给null
    var name: String = "hello"
//    name = null
    println(name)
    //TODO 第二种情况:声明时指定为可空类型
    var name2: String?
    name2 = null
//    name2 = "prettyant"
    println(name2)
}