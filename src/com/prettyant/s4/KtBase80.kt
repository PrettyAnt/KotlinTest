package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:38 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的初始化陷阱 1-- 学习
class KtBase80{
    var num = 8
    init {
        num=num.times(8)
    }
}
fun main() {
    val ktBase80 = KtBase80()
    println(ktBase80.num)
}