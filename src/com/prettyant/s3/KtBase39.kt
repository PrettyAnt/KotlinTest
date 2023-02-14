package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO Kotlin语法中对比使用if判断null值情况
fun main() {
    var name: String? = null
    name = "prettyant"
    //name.capitalize()//name是可空类型的, 如果真的是null, ?后面这一段代码不执行，就不会引发空指针异常

    if (name != null) {//if  也算是补救措施
        val r = name.capitalize()
        println(r)
    } else {
        println("name is null")
    }

}