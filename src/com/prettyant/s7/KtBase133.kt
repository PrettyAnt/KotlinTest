package com.prettyant.s7

fun show(name: String, age: Int=18, sex: Char = 'M') {
    println("姓名:$name, 年龄:$age, 性别:$sex")
}

@JvmOverloads//原理 : 编译器环节,会重载一个函数供java使用
fun toast(name: String, sex: Char = 'M') {
    println("姓名:$name,  性别:$sex")
}
//TODO Kotlin语言 注解@JvmOverloads
fun main() {
    show("prettyant")
}