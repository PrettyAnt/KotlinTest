package com.prettyant.s6

//自定义的中缀表达式 + 扩展函数一起使用    使用者 "一".gogogo  1'
//条件一:对第一个参数 S.gogogo进行函数扩展
//条件二:需要在括号(t:T)参数里面,传递一个参数
private infix fun<S,T> S.gogogo(t:T){
    //..
    println("我们的中缀表达式第一个参数的类容是:$this")
    println("我们的中缀表达式第二个参数的类容是:$t")
}

//TODO kotlin语言的[infix]关键字 [中缀]
fun main() {
    mapOf("零".to(0))
    mapOf("一".to(1))
    mapOf("二".to(2))
    mapOf("三".to(3))
    mapOf("四".to(4))
    println()

    //下面是自己写的中缀表达式
    123 gogogo 'M'
    "孙悟空".gogogo('M')
}