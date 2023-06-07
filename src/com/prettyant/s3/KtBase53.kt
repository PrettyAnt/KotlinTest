package com.prettyant.s3


//TODO Kotlin语言的 with 内置函数
fun main() {
    val str = "Prettyant"

    //具名操作
    val r1 = with(str, ::getStrLen)
    val r2 = with(r1, ::getLenInfo)
    val r3 = with(r2,::getInfoMap)
    with(r3,::showResult)

    println("-----------------")
    //匿名操作
    with(with(with(with(str) {
        length
    }) {
        "你的字符串长度为:$this"
    }) {
        "[$this]"
    }) {
        println(this)
    }
}

fun getStrLen(str: String)=str.length

fun getLenInfo(len:Int)="你的字符串长度为:$len"

fun getInfoMap(info:String)="[$info]"

fun showResult(info: String)=println(info)


