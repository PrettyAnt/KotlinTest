package com.prettyant.s7.ktBase130

//3.懒汉式的实现   Kotlin 版本
class SingletonDemo3Kt {
    companion object {
        private var instance: SingletonDemo3Kt? = null
            get() {
                if (field == null) {
                    field = SingletonDemo3Kt()

                }
                return field
            }
        @Synchronized
        fun getInstanceAction(): SingletonDemo3Kt = instance!!

    }

    fun show() {
        println("show")
    }
}

fun main() {
    SingletonDemo3Kt.getInstanceAction().show()
}