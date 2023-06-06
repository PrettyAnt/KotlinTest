package com.prettyant.s3

//TODO Kotlin语言的split操作 -- 解构操作
fun main() {
    val jsonText = "PrettyAnt,CoderKing,ChenYu,WangBei"
    //list 自动类型推断成 list == List<String>
    val list = jsonText.split(",")//val list :List<String> = jsonText.split(",")

    //直接输出list 集合 ，不解构
    println("分割后的list里面的元素有:$list")

    //C++ 解构  Kt也有解构
    val (v1, v2, v3, v4) = list
    println("解构四个只读变量的值是: v1:$v1, v2:$v2, v3:$v3, v4:$v4")
}



