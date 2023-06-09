package com.prettyant.s4

import com.prettyant.s1.age

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// todo  _name: String, _age: Int, _sex: Char 临时类型，必须要二次转换，才能用
class KtBase76(_name: String, _age: Int, _sex: Char) {//主构造
//这个不是Java的static{}
//相当于Java的{}构造代码块
//初始块  init代码块
init {
    println("init 主构造函数被调用了...$_name")//此代码块中可以调用name
    //如果第一个参数是false，就会调用第二个参数lamaba
    //判断name是不是空字符串
    require(_name.isNotBlank()) {
        "_name参数为空"
    }
    require(_age > 0) {
        // if the value is false.
        "你的age年龄不符合"
    }
    require(_sex == '男' || _sex == '女') {
        "性别很奇怪"
    }
}

    constructor(name: String) : this(name, 88, '男') {
        println("次构造代码块被调用了 $name")
    }


}

// TODO Kotlin语言的初始化块学习
//  1.name,sex,age的主构造函数
//  2.init代码块学习  require
//  3.临时类型只有在  「init」代码块才能调用


fun main() {
    KtBase76("CokderKing", _age = 100, _sex = '女')
    println("-------------")
    KtBase76("PrettyAnt")
//    KtBase76("")
}