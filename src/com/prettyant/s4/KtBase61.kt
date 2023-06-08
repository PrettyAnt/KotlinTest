package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的「解构」语法过滤元素学习  最多解构5个
// 1.集合配合解构语法
// 2.反编译看Java给三个变量赋值的代码
// 3.解构屏蔽接收值
fun main() {
    val list = listOf("ppd", "卢本伟", "五五开", "uu妹", "doinb")

    val (value1, value2, value3, value4,value5) = list
    println("value1:$value1 value2:$value2 value3:$value3 value4:$value4 value5:$value5")


    var (v1, v2, v3, v4,) = list
    v1 = "孙悟空"
    println("v1:$v1 v2:$v2 v3:$v3 v4:$v4")

    //用_可以不接受赋值，，可以节约性能
    val (_, n2, n3, _, n4) = list
//    println(_)   _不是变量名，是用来过滤解构赋值的，不接受赋值给我
    println("n2:$n2 n3:$n3 n4:$n4")
}