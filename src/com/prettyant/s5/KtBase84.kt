package com.prettyant.s5

import java.io.File

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:23 AM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
open class Person2(private val name: String) {
    //一般函数
    private fun showName() = "父类姓名:【$name]"
//    fun showName2() = "父类姓名:【$name]"

    //匿名函数
    //    val showName: () -> String = {
    //        "姓名:【$name]"
    //    }
    //匿名函数类型推断
//    val showName = {
//        "父类姓名:【$name]"
//    }
    val showName2 = {
        "父类姓名:【$name]"
    }
    open fun myPrintln() = println(showName())

    open fun describle() = println(showName2)

//    private fun showName(): String {
//        return "姓名:【$name]"
//    }
}

//KT所有的函数，默认是final修饰的，不能被重写，和Java相反
class Student2(private val subName: String) : Person2(subName) {
    private fun showName() = "子类姓名:【$subName]"
    override fun myPrintln() = println(showName())
    override fun describle() = println(showName2())

}
// TODO Kotlin语言的类型转换学习
// 1.普通运行子类输出
// 2.is Person Student File
// 3.is + as 转换

fun main() {
    val s2: Person2 = Student2("猪八戒")
    s2.myPrintln()
    println(s2 is Person2)
    println(s2 is Student2)
    println(s2 is File)
    println("----------")
    // is + as
    if (s2 is Student2) {
        (s2 as Student2).myPrintln()
        (s2 as Student2).describle()
    }
    println("----------")
    if (s2 is Person2) {
        (s2 as Person2).myPrintln()
        (s2 as Person2).describle()
    }
}
