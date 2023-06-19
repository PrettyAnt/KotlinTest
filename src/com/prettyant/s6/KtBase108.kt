package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 3:41 PM  19/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
class KtBase108<I>(val isR: Boolean, vararg objects: I) {
    //开启I 的只读模式
    val objArray: Array<out I> = objects

    // 1. 5种返回类型变化的解释
    fun getR(): Array<out I>? = objArray.takeIf { isR }

    //有可能是Array<out I>?  也有可能是String ,所以就属于这种类型
    fun getR2(): Any = objArray.takeIf { isR } ?: "你是null"

    fun getR3(): Any? = objArray.takeIf { isR } ?: null

    fun getR4(index: Int): I? = objArray[index].takeIf { isR } ?: null

    //I String? = Any ?
    fun getR5(index: Int): Any? = objArray[index].takeIf { isR } ?: "AAA" ?: null

    //运算符重载
    operator fun get(index: Int): I? = objArray[index].takeIf { isR }

}

//2.给泛型传入null后,直接操作
fun <I> inputObj(item: I) {
    //println((item as String).length)   fixme 在泛型中,不能这样做,这个是不标准的
    //泛型是很大的范围类型,可以接收很多类型,当然也可以接收null,但是接收null 后,要处理好,
    //String?  能够接收字符串,还可以接收null
    println((item as String?)?.length ?: "传递的参数为null")
}

//TODO Kotlin语言的[]操作符学习
// 1. 5种返回类型变化的解释
// 2.给泛型传入null后,直接操作
fun main() {
    inputObj("prettyant")
    inputObj(null)

    //<String?>为什么加问号,因为传入了问号
    val p1 :KtBase108<String?> = KtBase108(true, "prettyant", "孙悟空", "猪八戒", null)
    println(p1[0])
    println(p1[1])
    println(p1[2])
    println(p1[3])
}