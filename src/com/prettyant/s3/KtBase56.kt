package com.prettyant.s3

//TODO Kotlin语言的 takeUnless 内置函数  --takeUnless+it.isNullOrBlank()一起使用，可以验证字符串有没有初始化等功能
//takeIf 和 takeUnless 功能是相反的
//name.takeIf{ true/false} true:返回name 本身   false 返回null
//name.takeUnless{ true/false} false:返回name 本身   true 返回null
class Manager {
    private var infoValue: String? = null
    fun getInfoValue() = infoValue

    fun setInfoValue(infoValue: String) {
        this.infoValue = infoValue
    }
}

fun main() {
    val manager = Manager()
    manager.setInfoValue("prettyant帅")
    val r = manager.getInfoValue().takeUnless {
        it.isNullOrBlank()
    } ?: "未经过任何初始化值"
    println(r)
}



