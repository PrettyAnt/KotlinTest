package com.prettyant.s4

import com.prettyant.s1.age

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//  第一步: val _age: Int
class KtBase77(_name: String, val _age: Int) {
    //第二步：生成name  类成员和init代码块优先级是一样的，执行顺序为代码顺序
    val name = _name
    init {
        val nameValue = _name//第三步:生成nameValue细节
        println("init 代码块打印nameValue --->>> ${nameValue}")
    }

    //主构造
    //次构造  三个参数  必须调用主构造
    constructor(name: String, age: Int, sex: Char) : this(name, age) {
        //第五步：生成次构造细节
        println("次构造的参数  --->>>  name:$name  age:$age  sex:$sex")
    }
    //第四步
    val prettyant = "666"

}

// TODO Kotlin语言的构造函数初始化顺序
//  1.main调用次构造 name age sex
//  2.主构造 val变量
//  3.var name =_name
//  4.init {name 打印}
fun main() {
    //调用次构造
    KtBase77("孙悟空", 998, '猴')
}