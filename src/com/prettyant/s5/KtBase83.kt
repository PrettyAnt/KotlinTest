package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:23 AM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//KT所有的类，默认是final修饰的，不能被继承，和Java相反
open class Person(private val name: String) {
    //一般函数
    //    private fun showName() = "父类姓名:【$name]"
    //匿名函数
    //    val showName: () -> String = {
    //        "父类姓名:【$name]"
    //    }
    //匿名函数类型推断
    val showName = {
        "父类姓名:【$name]"
    }

    open fun myPrintln() = println(showName())

//    private fun showName(): String {
//        return "父类姓名:【$name]"
//    }
}

//KT所有的函数，默认是final修饰的，不能被重写，和Java相反
class Student(private val subName: String) : Person(subName) {
    private fun showName() = "子类姓名:【$subName]"
    override fun myPrintln() = println(showName())

}

// TODO Kotlin语言的继承与重载的open关键字学习
// 1.父类 val name showName() -> String myPrintlin -> Unit
// 2.子类 myPrintln -> Unit
fun main() {

    val person: Person = Student("孙悟空666")
    person.myPrintln()
}