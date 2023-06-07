package com.prettyant.s3


//TODO Kotlin语言的 run 内置函数
//1.run 的特点  字符串延时
//2.具名函数判断长度 isLong
//3.具名函数监测合格 showText
//4.具名函数增加一个括号 mapText
//5.具名函数输出内容
fun main() {
    val str = "prettyant is a coder"
    val r1: Float = str.run {
        //this == str 本身
        true
        66.68f
    }
    println(r1)

    //2.具名函数判断长度 isLong
    //这个是属于匿名函数配合run
    str.run {
        //this == str
    }

    //这个属于具名函数
//    str.run(具名函数)
    str
        .run(::isLong)//this == str 本身
        .run(::showText)//this == 上面返回的boolean
        .run(::mapText)
        .run(::println)
    //>>>>>>>>>>>>>>>>>>>>>  上面全部都是具名函数调用给run执行   下面全是 匿名函数调用给run执行
    str
        .run {
            if (length > 5) true else false
        }.run {
            if (this) "字符串合格" else "字符串不合格"
        }.run {
            "[$this]"
        }.run {
            println(this)
        }

    // -------->>it 方案
    //let函数持有it,run函数持有this ,都可以很灵活的把上一个结果自动给下一个函数
    println("----------------------------------------------------------------")
    str
        .let {
            if (it.length>5) true else false
        }
        .let {
            if (it) "it 字符串合格" else "it 字符串不合格"
        }
        .let {
            "[$it]"
        }
        .let {
            println(it)
        }

    str
        .let(::isLong)//this == str 本身
        .let(::showText)//this == 上面返回的boolean
        .let(::mapText)
        .let(::println)


//    println(r2)

}

fun isLong(str: String) = if (str.length > 5) true else false

fun showText(isLong: Boolean) = if (isLong) "字符串合格" else "字符串不合格"

fun mapText(getShow: String) = "[$getShow]"


