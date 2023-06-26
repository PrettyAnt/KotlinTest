package com.prettyant.s6

//TODO Kotlin语言的互操作性与可控性
fun main() {
    //下面是Java与Kotlin 交互,错误的案例
//    println(KtBase129().info1.length)
//    println(KtBase129().info2.length)
//
//    //下面是Java与Kotlin交互,也是错误的案例
//    val info1 = KtBase129().info1
//    val info2 = KtBase129().info2
//    println(info1.length)
//    println(info2.length)

    //todo 下面是Java与Kotlin交互,正确的案例1
    //:String! 与Kotlin交互的时候,Java给Kotlin用的值,都是 :String! 这种类型的
    //只要是看到有 :String!的类型,在使用的时候,必须是 ?....这个是规则1,这个规则1不太好,如果忘记写了,就会奔溃
    val info3: String? = KtBase129().info1
    val info4: String? = KtBase129().info2
    println(info3?.length)
    println(info4?.length)

    //todo 下面是Java与Kotlin交互,正确的案例2
    // 建议使用 String?来接收
    val info1: String? = KtBase129().info1
    val info2: String? = KtBase129().info2
    println(info1?.length)
    println(info2?.length)
}