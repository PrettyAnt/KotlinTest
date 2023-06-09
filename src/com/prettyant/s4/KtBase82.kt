package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:38 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的初始化陷阱 3-- 学习
class KtBase82(_info: String) {
    private val info = _info
    val content: String = getInfoMethod()

//    private val info = _info//把这段转换info的代码写在前面

    fun getInfoMethod() = info
}

fun main() {
    println("内容的长度是 --->>> ${KtBase82(" PrettyAnt ").content.length}")
}