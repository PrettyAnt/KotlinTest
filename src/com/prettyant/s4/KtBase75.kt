package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */

// TODO Kotlin语言的构造函数中默认参数学习
class KtBase75(_name: String="孙悟空") {
    //次构造函数，必须要调用主构造,否则不通过
    //为什么次构造必须调用主构造？  -->> 主构造统一管理，为了更好的初始化设计
    //两个参数的次构造函数
    constructor(_name: String="2个参数的默认值", _age: Int) : this(_name) {
        println("2个参数的构造 -->>  name:${_name} age:${_age} ")
    }

    //3个参数的次构造函数，必须要调用主构造
    constructor(_name: String, _age: Int, _sex: Char) : this(_name) {
        println("3个参数的构造 -->>  name:${_name} age:${_age}  sex:${_sex}")
    }

    constructor(_name: String="这是一个默认参数", _age: Int=9999999, _sex: Char='Y', _info: String="好快咯.....") : this(_name) {
        println("4个参数的构造 -->>  name:${_name} age:${_age}  sex:${_sex} info:${_info}")
    }
}

fun main() {
    KtBase75()//优先调用了主函数
    KtBase75(_name = "孙行者")
    KtBase75(_age = 80)
    KtBase75( _age = 68, _sex = 'M')
    KtBase75(_name = "白龙马", _age = 58, _sex = 'P', _info = "马儿驾驾驾")
}