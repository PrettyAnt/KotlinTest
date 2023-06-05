package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO Kotlin语言的先决条件函数  -- 也可以使用以下几个函数处理异常问题
fun main() {
    var value1: String? = null
    var value2: Boolean = false

//    checkNotNull(value1)//java.lang.IllegalStateException: Required value was null

//    requireNotNull(value1)//java.lang.IllegalArgumentException: Required value was null.

    require(value2)//boolean类型为false也会抛异常
}


