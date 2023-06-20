package com.prettyant.s6

// 1.String 类型就输出长度
fun <T> T.showContentInfo() = println(if (this is String) "字符串长度是${this.length}" else "不是字符串,内容是$this")

// 2.显示调用时间
fun <T> T.showTime() = println("当前调用的时间为:${System.currentTimeMillis()} $this")

//3.显示调用者的类型
fun <I> I.showTypesAction() =
    when (this) {
        is String -> "String 类型"
        is Int -> "Int 类型"
        is Char -> "Char 类型"
        is Float -> "Float 类型"
        is Double -> "Double 类型"
        is Boolean -> "Boolean 类型"
        is Unit -> "函数类型"
        else -> "未知类型"
    }


fun commonFun() {}

//TODO Kotlin语言泛型扩展函数
// 1.String 类型就输出长度
// 2.显示调用时间
// 3.显示调用者的类型
fun main() {
    println("----------1-----------")
    666.showContentInfo()
    'C'.showContentInfo()
    "prettyant".showContentInfo()
    668.8f.showContentInfo()
    commonFun().showContentInfo()
    null.showContentInfo()
    println("----------2-----------")
    "688".showTime()
    //所有类型  都是泛型,对泛型扩展了showContentInfo,那么所有类型都可以使用showContentInfo
    println("----------3-----------")
    println(commonFun().showTypesAction())
    println("prettyant".showTypesAction())
    println(688.showTypesAction())
}