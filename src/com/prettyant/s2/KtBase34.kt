package com.prettyant.s2

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 *
 * Created on 4:13 下午  9/02/23
 * PackageName : com.prettyant.s2
 * describle :
 */
//TODO Kotlin语言的匿名函数与具名函数
fun main() {
    //匿名函数
    showPersonInfo("Prettyant", 28, '男', "学习Kotlin语言", showResult = { result: String ->
        println("我是一个匿名函数:$result")
    })
    //匿名函数
    showPersonInfo("Prettyant", 28, '男', "学习Kotlin语言") {
        println("我是一个匿名函数2:$it")
    }
    //具名函数
    showPersonInfo("Prettyant", 28, '男', "学习Kotlin语言", ::showImpl)
}

fun showImpl(result: String) {
    println("我是一个具名函数:$result")
}

inline fun showPersonInfo(
    name: String,
    age: Int,
    sex: Char,
    study: String,
    showResult: (String) -> Unit
) {
    var str = "name:$name,age:$age,sex:$sex,study:$study"
    showResult(str)

}