package com.prettyant.s7

class MyObject{
    companion object {
        @JvmField
        val TARGET = "黄石公园"

        @JvmStatic
        fun showAction(name:String)= println("$name will to play at $TARGET")

    }
}
//TODO Kotlin语言 注解@JvmStatic
fun main() {
    MyObject.TARGET
    MyObject.showAction("PrettyAnt")
}