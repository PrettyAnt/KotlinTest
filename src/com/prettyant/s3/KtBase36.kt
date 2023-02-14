package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO Kotlin语言的安全调用操作符
fun main() {
    var name: String? = "prettyAnt"
//    name = null
//    name.capitalize()//name是可空类型的,可能是null,想要使用name,必须给出补救措施  capitalize首字母大写
    var result = name?.capitalize()//name是可空类型的, 如果真的是null, ?后面这一段代码不执行，就不会引发空指针异常
    println(result)
}