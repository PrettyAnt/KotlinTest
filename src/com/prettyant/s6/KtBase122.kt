package com.prettyant.s6

import java.io.File

//TODO Kotlin语言的[apply]函数详解 [手写apply函数]
fun main() {
    File("a.txt")
        .mApply {
            setReadable(true)
            setWritable(true)
            println("1  readLines: ${readLines()}")
        }.mApply {
            setReadable(true)
            setWritable(true)
            println("2  readLines: ${readLines()}")
        }

//    688.mApply()
    //..
}

/**
 * private 私有
 * inline 因为我们的函数是高阶函数,需要使用内联对lambda进行有哦华处理,提高性能
 * fun <I>  函数中声明一个泛型
 * I.mApply 让所有的类型,都可以 xxx.mApply 泛型扩展
 * I.() -> Unit 让我们的匿名函数里面持有 this , 在lambda里面不需要返回值,因为永远都是返回I本身
 * lambda(this)  默认就有this
 * 返回this的目的是可以链式调用
 */
private inline fun <I> I.mApply(lambda: I.() -> Unit): I {
    //fixme  this表示I对象,it表示参数 ??
    lambda()
    return this
}