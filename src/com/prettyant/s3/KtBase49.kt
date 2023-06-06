package com.prettyant.s3

import kotlin.math.roundToInt

//TODO Kotlin语言中Double转Int与类型格式化
fun main() {
    println(65.464646.toInt())//65 取整

    println(65.464646.roundToInt())//65 四舍五入

    println(65.864646.roundToInt())//66 四舍五入

    // 结论，toInt 取整， roundToInt 四舍五入


    //r的类型： String
    val r="%.3f".format(65.464646)//四舍五入 保留3位有效数字
    println(r)
}



