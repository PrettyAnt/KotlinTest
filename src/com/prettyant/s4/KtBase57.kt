package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的List创建与元素获取学习
fun main() {
    val list = listOf("PrettyAnt", "BeiBei", "FeiFei", "BaoBao")
    //普通的取值方式：索引    内部实现: 运算符重载
    println(list[0])
    println(list[1])
    println(list[2])
    println(list[3])
//    println(list[4])

    //我们写kt代码一定不会出现空指针异常，下表越界异常
    //防止出现越界问题
    println("-------------------")
    println(list.getOrElse(5){"越界"})
    println(list.getOrNull(4))
    //一般操作
    println(list.getOrNull(4) ?: "你越界了")
    //小结：开发过程中，尽量使用getOrElse或getOrNull,才能体现KT的亮点
}