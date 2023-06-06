package com.prettyant.s3

/**
 * 内置函数的总结
 *
 * apply
 * 1.apply函数返回类型，一直都是info本身
 * 2.apply函数的匿名函数里面持有的是 this == info本身
 *
 * let:
 * 1.let函数返回类型，是根据匿名函数最后一行的变化而变化
 * 2.let函数的匿名函数里面持有的是it == 集合本身
 */

//TODO Kotlin语言的let内置函数  和apply的区别:apply返回的是本身，let返回的是最后一行
//普通方式 对集合第一个元素相加
//let方式 对集合第一个元素相加
//普通方式 对值判null,并返回
//let方式 对值判null,并返回
fun main() {
    //普通方式 对集合第一个元素相加
    val list = listOf(6, 5, 2, 3, 5, 7)
    val value1 = list.first()//第一个元素
    val result1 = value1 + value1
    println(result1)

    //let方式 对集合第一个元素相加
    //let函数返回类型，是根据匿名函数最后一行的变化而变化
    //let函数的匿名函数里面持有的是it == 集合本身
    val let1: Int = listOf(6, 5, 2, 3, 5, 7).let {
        //it == list集合
        it.first() + it.first()//匿名函数的最后一行作为返回值,let的特点。  但是前面的apply永远返回的是info本身
    }
    println(let1)

    //普通方式 对值判null,并返回
    println(getMethod("prettyant"))
    println("----------------------------------------------------------------")
    println(getMethod2(null))
    println("----------------------------------------------------------------")
    println(getMethod3(null))
}

//普通方式 对值判null,并返回
fun getMethod(value: String?) = if (value == null) "传递的内容为空" else "传递的值为$value"

//let方式 对值判null,并返回
fun getMethod2(value: String?) =
    value?.let {
        "传递的值为$it"
    } ?: "传递的值为空"


//
fun getMethod3(value: String?): String {
    return value ?: "传递的值为 --->> $value"
}



