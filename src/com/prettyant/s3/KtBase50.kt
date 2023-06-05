package com.prettyant.s2

import java.util.*

//TODO Kotlin语言的apply内置函数
fun main() {
    val info="PrettyAnt is a handsome person"
   //普通函数
    println("info字符串的长度是:${info.length}")
    println("info最后一个字符是:${info[info.length-1]}")
    println("info全部转换成小写:${info.lowercase(Locale.getDefault())}\n\n")

    //apply内置函数
    //apply特点: apply始终返回info本身
    val infoNew:String=info.apply {
        //一般大部分情况下，匿名函数，都会持有一个it，但是apply函数不会持有it,却都会持有当前this == info 本身
        println("apply 匿名函数里面打印的:$this\n")
        println("info字符串的长度是:${length}")
        println("info最后一个字符是:${this[length-1]}")
        println("info全部转换成小写:${this.lowercase(Locale.getDefault())}\n\n")
    }
    println("apply返回的值:$infoNew")

    //
}



