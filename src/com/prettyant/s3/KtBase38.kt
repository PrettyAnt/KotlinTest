package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO Kotlin 语言中的非空弄断言操作符特点
fun main() {
    var name: String? = null
    //name.capitalize()//name是可空类型的, 如果真的是null, ?后面这一段代码不执行，就不会引发空指针异常

    name = "PrettyAnt"
    //补救措施    我们已经学习过  ?
    var r = name!!.capitalize()//!! 不管name是不是null,都执行，这个和java一样了
    println(r)

    //结论: 如果百分百能够保证name是有值的，那么才能使用断言 !! ,否则有java 的空指针异常的风险
}