package com.prettyant.s1

//TODO  kotlin语言只读变量
fun main() {
    //  var 默认提示：变量永远不会被修改，建议修改撑val==不可改变的(只读)
    val info: String = "MyInfo"
//    info="AA"
    println(info)

    /**
     * 只读   变量名 类型      值
     * val  age  :  Int =   99
     */
    val age: Int = 99
//    info=88 //不能修改
    println(age)
}