package com.prettyant.s1


//  TODO kotlin 语言的引用类型学习
//  java 语言有两种数据类型
//   第一种：基本类型：int double 等
//   第二种: 引用类型：String 等

//  Kotlin 语言只有一种数据类型:
//          看起来都是引用类型，实际上编译器会在Java字节码中，修改成"基本类型"
fun main() {
    val age: Int = 99
    val pi: Float = 3.145f
    val pi2: Double = 3.1415
    val isOk: Boolean = false
}