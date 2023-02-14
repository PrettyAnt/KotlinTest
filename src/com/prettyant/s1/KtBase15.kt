package com.prettyant.s1


//  TODO kotlin 语言的String 模板

fun main() {
    val garden = "世纪公园"
    val time = 6
    println("今天天气晴朗，可以去${garden}玩,玩了$time 小时")

    val isLogin = false
    println("server response result:${if(isLogin)"恭喜你登录成功" else "很遗憾，登录失败"}")
}