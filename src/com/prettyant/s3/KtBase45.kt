package com.prettyant.s2

//TODO Kotlin语言的replace完成加密解密操作
//ABCDEFGHIJKLMNOPQRSTUVWXYZ
fun main() {
    val sourcePws = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println("原始密码是:$sourcePws")

    //加密操作  把字符替换成数字 打乱了，就属于加密了
    val r1 = sourcePws.replace(Regex("[AKMNQ]")) {
//        it.value
        when (it.value) {//it.value指代的是"[AKMNQ]"中的字符
            "A" -> "9"
            "B" -> "0"
            "K" -> "8"
            "M" -> "7"
            "N" -> "6"
            "Q" -> "5"
            else -> it.value
        }
    }
    println("加密后的密码是:$r1")
    //解密操作
    var sourcePwdNew = r1.replace(Regex("[123456789]")) {
//        it.value
        when (it.value) {//it.value指代的是"[AKMNQ]"中的字符
             "9"->"A"
             "0"->"B"
             "8"->"K"
             "7"->"M"
             "6"->"N"
             "5"->"Q"
            else -> it.value
        }
    }
    println("\n解密后的密码是:$sourcePwdNew")
}



