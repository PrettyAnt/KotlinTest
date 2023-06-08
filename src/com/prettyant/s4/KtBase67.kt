package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的读取Map的值
// 1、[]找不到不会返回null
// 2、getOrDefault
// 3、getOrElse
// 4、与java一样，会奔溃
fun main() {
    val map /*: Map<String, Double>*/ = mapOf("孙悟空" to 50.0, "唐僧" to (80.0), "猪八戒" to 40.0)//
    println("--------[]找不到不会返回null--------")
    //1、[]找不到不会返回null
    println(map["孙悟空"])//背后对 [] 运算符重载了  结果:50.0
    println(map["888"])//map通过key找，如果找不到，不会奔溃
    println(map.get("孙悟空"))//map通过key找，如果找不到，不会奔溃

    println("-------getOrDefault-------")
    // 2、getOrDefault
    println(map.getOrDefault("孙悟空", 888))
    println(map.getOrDefault("六耳猕猴", 888))

    println("-------getOrElse-------")
//    3、getOrElse
    println(map.getOrElse("孙悟空") { 666 })
    println(map.getOrElse("六耳猕猴") { 666 })//等价于  println(map.getOrElse("六耳猕猴",{666}))

    println("-------类似Java方式-------")
    // 4、与java一样，会奔溃   尽量不要使用此方式
//    println(map.getValue("孙悟空2"))//会奔溃


}