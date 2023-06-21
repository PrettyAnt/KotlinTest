package com.prettyant.s6

import java.io.File
import java.nio.charset.Charset
import java.util.ArrayList

data class ResponseResult(val msg: String, val code: Int)
data class ResponseResult1(val msg: String, val code: Int)
data class ResponseResult2(val msg: String, val code: Int)
data class ResponseResult3(val msg: String, val code: Int)

//对超类进行一个函数扩展
fun Any.showPrintlnContent() = println("当前内容是:$this")
fun Any.showPrintlnContent2(): Any {
    println("当前内容是:$this")
    return this
}

//TODO Kotlin语言的超类上定义扩展函数
// 1.扩展函数不允许被重复定义
// 2.对超类扩展函数的影响
// 3.扩展函数 链式调用
class KtBase115 {
}

fun main() {
    ResponseResult("login success", 200).showPrintlnContent()
    ResponseResult1("login faile", 404).showPrintlnContent()
    ResponseResult2("login overtime", 200).showPrintlnContent()
    ResponseResult3("exit success", 200).showPrintlnContent()
    "PrettyAnt".showPrintlnContent()
    val number1 = 666
    number1.showPrintlnContent()
    val number2 = 688.8f
    number2.showPrintlnContent()
    val sex = 'W'
    sex.showPrintlnContent()
    "PrettyAnt".showPrintlnContent2().showPrintlnContent2().showPrintlnContent2().showPrintlnContent()
    'A'.showPrintlnContent2().showPrintlnContent2().showPrintlnContent2()
    println(File("a.txt").readLines())
}
//todo 如果我们自己写了同样的扩展函数,编译不通过

//todo  Kotlin内置扩展函数,被重复定义,属于覆盖,而且优先使用我们自己的
//public fun File.readLines(charset: Charset = Charsets.UTF_8): List<String> {
//    val result = ArrayList<String>()
//    forEachLine(charset) { result.add(it); }
//    return result
//}