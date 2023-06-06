package com.prettyant.s3

import java.io.File
import java.util.*

//TODO Kotlin语言的apply内置函数
fun main() {
    val info = "PrettyAnt is a handsome person"
    //普通函数
    println("info字符串的长度是:${info.length}")
    println("info最后一个字符是:${info[info.length - 1]}")
    println("info全部转换成小写:${info.lowercase(Locale.getDefault())}\n\n")

    //apply内置函数
    //todo apply特点: apply始终返回info本身
    val infoNew: String = info.apply {
        //一般大部分情况下，匿名函数，都会持有一个it，但是apply函数不会持有it,却都会持有当前this == info 本身
        println("apply 匿名函数里面打印的:$this\n")
        println("info字符串的长度是:${length}")
        println("info最后一个字符是:${this[length - 1]}")
        println("info全部转换成小写:${this.lowercase(Locale.getDefault())}\n\n")
    }
    println("apply返回的值:$infoNew\n\n")

    //真正使用apply否、函数的写法规则如下：
    //info.apply特点:apply函数始终返回"info本身"，所以可以链式调用
    info.apply {
        println("apply 链式 匿名函数里面打印的:$this")
    }.apply {
        println("info 链式 字符串的长度是:${length}")
    }.apply {
        println("info 链式 最后一个字符是:${this[length - 1]}")
    }.apply {
        println("info 链式 全部转换成小写:${this.lowercase(Locale.getDefault())}")
    }

    //eg
    val file = File("/Users/chenyu/Documents/MyOnwProject/KotlinTest/README.MD")
    file.setExecutable(true)
    file.setReadable(true)
    println(file.readLines())

    //apply写法
    //匿名函数里面 持有的this == file本身
    file.apply {
        setExecutable(true)
    }.apply {
        setReadable(true)
    }.apply {
        println(file.readLines())
    }
}



