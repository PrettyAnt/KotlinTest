package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:23 AM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//在KT中，所有的类，都隐式继承了Any
//Any在KT设计中：只是提供标准，看不到实现，实现在各个平台处理即可
class obj :Any()
// TODO Kotlin语言的Any超类学习
fun main() {
    println(obj().toString())
}