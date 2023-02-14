package com.prettyant.s1


//TODO kotlin 语言的when表达式 -- 表达式比语句更强大，会有返回值

fun main() {
    val week = 8


    //Java 的 if 语句
    //Kotlin 的 if 是表达式 有返回值的


    val info = when (week) {
        1->"今天是星期一，上班"
        2->"今天是星期二，修bug"
        3->"今天是星期三，开会"
        4->"今天是星期四，写代码"
        5->"今天是星期五，摸鱼"
        6->"今天是星期六，学习的一天"
        7->"今天是星期日，学习第二天"
//        else -> "不满足"
        else -> {
            println("在家养猪")
            "不满足"
        }
    }
    println("输出结果为 : $info")//void 在java中是关键字  无返回   用Unit类代替了java的void关键字
}