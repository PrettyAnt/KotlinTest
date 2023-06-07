package com.prettyant.s3

import java.io.File
import java.util.*


//TODO Kotlin语言的 also 内置函数
//"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
fun main() {
    var str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val r: String = str.also {
        true
        2332525.6f
        456
        'C'
    }
    println(r)

    val r2: Int = 123.also {
        true
        2332525.6f
        456
        'C'
    }


    //特点：also函数始终返回"str本身",所以可以链式调用
    str.also {
        println("str的原始数据是$it")
    }.also {
        println("str转换为大写${it.uppercase(Locale.getDefault())}")
    }.also {
        println("str转换为小写${it.lowercase()}")
    }

    //匿名函数里面做的事情，和sourceFile无关，因为永远都是返回file本身
    val file= File("a.txt")
    val sourceFile = file.also {
        it.setReadable(true)
        it.setWritable(true)
        println(file.readLines())
//        it.delete()
    }
    println("文件是否存在--->> ${sourceFile.exists()}")
}


