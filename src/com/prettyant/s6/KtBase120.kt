package com.prettyant.s6
//导入扩展文件
//在工作中非常有用,可以把很多的扩展操作,写到某一个地方,到时候引入过来用,比较独立化
import com.prettyant.s6.com.prettyant.randomItemValue
import com.prettyant.s6.com.prettyant.randomItemValuePrintln

//TODO Kotlin语言的定义扩展文件
fun main() {
    val list: List<String> = listOf("孙悟空", "猪八戒", "唐僧")
    val set: Set<Double> = setOf(688.5, 666.5, 699.5)
    //如果不使用扩展文件
    println(list.shuffled().first())
    println(set.shuffled().first())
    println("---------自定义扩展文件实现-------------")
    //使用扩展文件
    println(list.randomItemValue())
    println(set.randomItemValue())
    println()
    list.randomItemValuePrintln()
    set.randomItemValuePrintln()

}