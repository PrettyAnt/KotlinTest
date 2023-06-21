package com.prettyant.s6

fun String?.outputStringValueFun(defaultValue: String) = println(this ?: defaultValue)
fun String?.outputStringValueGet(defaultValue: String?): String? = this?:defaultValue

//TODO Kotlin语言的可空类型扩展函数
// 如果是null,就输出默认值
fun main() {
    val infoValue: String? = null//infoValue是可空的类型  String String?==可空类型的
    infoValue.outputStringValueFun("这是一个默认值")
    //String? 前面已经说过了,可以接收  可空数据  也可以接收  有值数据
    //String  前面已经说过了,只能接收  有值数据
    val name = "PrettyAnt"
    name.outputStringValueFun("这是一个默认值prettyant")
    println(infoValue.outputStringValueGet("默认值3"))

}