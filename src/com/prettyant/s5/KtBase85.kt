package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:23 AM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
open class Person3(private val name: String) {
    //一般函数
    private fun showName() = "父类姓名:【$name]"
    open fun myPrintln() = println(showName())
    fun methodPerson() = { println("父类独有的方法......") }
}

class Student3(private val subName: String) : Person3(subName) {
    private fun showName() = "子类姓名:【$subName]"
    override fun myPrintln() = println(showName())
    fun methodStudent() = run { println("子类独有的方法......") }
}

// TODO Kotlin语言的智能类型转换
fun main() {
    val p: Person3 = Student3("孙悟空666")
    p as Student3
    p.methodStudent()
    //智能类型转换：会根据上面as转成的类型，自动明白，你现在的类型就是上面的类型


}