package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的可变Set集合
fun main() {
    val muset= mutableSetOf("ppd", "卢本伟", "五五开", "uu妹", "doinb")
    muset += "孙悟空"
    muset += "唐僧"
    muset -= "ppd"
    muset.add("白龙马")
    muset.remove("五五开")
    println(muset)

}