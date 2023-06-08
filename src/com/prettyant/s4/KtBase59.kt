package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的mutator函数学习   +=
//1. mutator += -= 操作
//2. removeIf
fun main() {
    val list: MutableList<String> = mutableListOf("卢本伟", "Doinb", "五五开", "uu妹")
    list += "ppd" //mutator的特性  += -= 其实背后就是运算符重载
    list += "大司马"
    list -= "Doinb"
    println(list)

    //2. removeIf
//    list.removeIf { true }//自动遍历整个集合，进行一个元素 一个元素的删除
    list.removeIf {
        it.contains("uu")//过滤所有的元素,只要有uu的元素，就是true删除
    }
    println(list)

}