package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:41 AM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
class AddClass(number1: Int, number2: Int)

//写一个数据类,就是为了toString()方便而已
data class AddClass2(var number1: Int, var number2: Int) {
    operator fun plus(p1: AddClass2): Int {
        return (number1 + p1.number1) + (number2 + p1.number2)
    }
//    operator fun AddClass2.  //可以查看整个KT可以用的 运算符重载方式
}


//TODO Kotlin 语言的运算符重载学习
fun main() {
    //C++语言  +预算符重载就行了   -运算符重载就行了
    //KT 语言  plus代表+运算符
    println(AddClass2(1, 1) +AddClass2(2, 2))
    println(AddClass2(2, 3).plus(AddClass2(5, 6)))
}