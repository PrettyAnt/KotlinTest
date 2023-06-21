package com.prettyant.s6

import java.io.File

class Context {
    val info = "我是PrettyAnt"
    fun toast(str: String) = println("toast:$str")
}

inline fun Context.apply5(lambda: Context.(String) -> Unit): Context {
    lambda(info)
    return this
}

//------------------------------------------
inline fun File.applyFile(action: (String,List<String>?) -> Unit): File {
    action(name, readLines())
    return this
}

//TODO Kotlin语言的DSL学习[扩展函数区别?]
// DSL简介 所谓DSL领域专用语言(Domain Specified Language/DSL)
fun main() {
//todo
// 其实applyFile函数,就是DSL编程范式,定义输入输出等规则:
// 1.定义整个lambda规则标准: 输入   必须是Context这个类,才有资格调用apply5函数
// 2.定义整个lambda规则标准: 输出   我们始终会使用返回Context本身
// 然后main函数就可以根据DSL编程方式标准规则,来写具体的实现,这就是DSL编程范式
    val context = Context().apply5 {
        //it == String ==
        println("it--->>> $it, this-->>> $this")
        toast("success")
        toast(it)
        toast(this.info)
    }
    println(context)
    println(context.info)
    println("------------------------------------------")

//todo
// 其实applyFile函数,就是DSL编程范式,定义输入输出等规则:
// 1.定义整个lambda规则标准: 输入   必须是File这个类,才有资格调用applyFile函数,匿名函数中持有name data
// 2.定义整个lambda规则标准: 输出   我们始终会使用返回File本身,所以可以链式调用
// 然后main函数就可以根据DSL编程方式标准规则,来写具体的实现,这就是DSL编程范式
    val resultFile = File("a.txt")
        .applyFile { name, data ->
            println("文件名为:$name, 文件中的数据为:$data")
        }.applyFile { name, data ->
            println("over")
        }
    println("file本身为:$resultFile")

}