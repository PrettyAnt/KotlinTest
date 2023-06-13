package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 2:25 PM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//KT 想表达  枚举其实也是一个class  为了让枚举有更丰富的功能
enum class Week {
    星期一,
    星期二,
    星期三,
    星期四,
    星期五,
    星期六,
    星期日
}

//TODO Kotlin语言的枚举类学习
fun main() {
    println(Week.星期一)
    println(Week.星期五)
    //注意:  枚举的值 等价于枚举本身
    println(Week.星期三 is Week)
}