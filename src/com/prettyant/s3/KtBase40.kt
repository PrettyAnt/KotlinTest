package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO 在Kotlin空合并操作符
fun main() {
    var info: String? = "李小龙"
//    info = null
    //空合并操作符   xxx ?:"结果为null"    如果xxx等于null，就会执行 ?: 后面的区域
    println(info ?: "结果为null")

    //let函数 + 空合并操作符
    println(info?.let { "[$it 不为null]" } ?: "[结果为null]")
}