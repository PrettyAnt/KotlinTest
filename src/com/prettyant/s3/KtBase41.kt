package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO 在Kotlin语法中异常处理与自定义异常特点
fun main() {
    try {
        var info: String? = null

        checkException(info)

        println(info!!.length)
    } catch (e: Exception) {
        println("羊了个羊: $e")
    }
}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException() : IllegalArgumentException()
class CustomException2(message: String?) : IllegalArgumentException(message)
