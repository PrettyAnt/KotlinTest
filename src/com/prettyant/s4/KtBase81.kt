package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:38 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的初始化陷阱 2-- 学习
class KtBase81 {
    val info: String

    init {
        info = "PrettyAnt"
        getInfoMethod()
//        info = "PrettyAnt"
    }

    private fun getInfoMethod() {
        println("info: ${info[0]}")
    }
}

fun main() {
    KtBase81()
}