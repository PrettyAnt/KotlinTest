package com.prettyant.s1


//  TODO kotlin 中函数参数的默认参数

fun main() {
    action01("chenyu", 29)
    action02("wangbei", 26)
    action03(age=3)
    action03(age=1, name = "求求")
}

private fun action01(name: String, age: Int) {
    println("我的姓名是:$name ,我的年龄是:$age")
}

private fun action02(name: String, age: Int = 18) {
    println("我的姓名是:$name ,我的年龄是:$age")
}
private fun action03(name: String="棉球", age: Int = 66) {
    println("我的姓名是:$name ,我的年龄是:$age")
}