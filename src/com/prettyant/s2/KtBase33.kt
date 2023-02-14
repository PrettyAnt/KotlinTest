package com.prettyant.s2

//TODO Kotlin语言的函数类型作为返回类型 -- 关联知识点 KtBase24
fun main() {
    val r = show("学习Kotlin语言")
    //r 是show函数的返回值
    println(r)

    val niming_showMethod = showMethod("学习java语言")
    //niming_showMethod 是 showMethod函数的返回值，只不过这个返回值是一个函数

    //niming_showMethod == 匿名函数
    println(niming_showMethod("PrettyAnt", 18))


}

fun show(info: String): Boolean {
    println("我是show函数 info:$info")
    return false
}

fun show2(info: String): String {
    println("我是show函数 info:$info")
    return "DDD"
}


//showMethod函数 再返回一个匿名函数
fun showMethod(info: String): (String, Int) -> String {
    println("我是show函数 info:$info")
    return { name: String, age: Int ->
        "我就是一个匿名函数,我的name:$name age:$age"
    }
}


//---------------------------------练习----------------------



















