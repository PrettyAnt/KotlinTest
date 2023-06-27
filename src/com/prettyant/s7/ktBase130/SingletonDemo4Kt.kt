package com.prettyant.s7.ktBase130

//4.懒汉式的实现  双层校验安全 Kotlin 版本
class SingletonDemo4Kt private constructor() {
    companion object {
        val instance: SingletonDemo4Kt by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) { SingletonDemo4Kt() }
    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo4Kt.instance.show()
}