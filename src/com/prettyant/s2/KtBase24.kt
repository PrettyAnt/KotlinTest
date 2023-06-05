package com.prettyant.s2

//TODO Kotlin语言的函数类型&隐式返回学习 ---  关联知识点 KtBase16.kt  KtBase33.kt-showMethod
fun main() {
    //第一步：函数输入输出的声明  --  理解这句话，反复阅读
    val methodAction: () -> String

    //第二步：对上面函数的实现
    methodAction = {
//        return "PrettyAnt" //匿名函数，不能这么写
        val inputValue = 999999
        "$inputValue PrettyAnt"     //== 背后隐式   "$inputValue PrettyAnt"
        //匿名函数不要写return,最后一行就是返回值
    }

    //第三步：调用此函数
    println(methodAction())

}
