package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */

// TODO Kotlin语言的主构造函数学习
//  主构造函数：规范来说，都是增加_xxx的方式，临时的输入类型，不能直接用
//  需要接收下来成为变量才能用,-name 等等，都是临时的类型，需要转换一下
class KtBase72(_name: String, _sex: Char, _age: Int, _info: String) {
    var name = _name
        get() = field//get 不允许私有化
        private set(value) {
            field = value
        }
    val sex = _sex
        get() = field

    //    set(value) {}  只读的，不能被修改
    val age = _age
        get() = if (field < 0) -1 else field
    val info = _info
        get() = "[$field]"

    //主构造函数
    fun show() {
        println("name:${name} age:${age}  sex:${sex} info:${info}")
    }
}

fun main() {
    val ktBase72 = KtBase72(_name = "孙悟空", _age = -43, _sex = 'M', _info = "齐天大圣")
    ktBase72.show()
//    println("name:${ktBase72.name} age:${ktBase72.age}  sex:${ktBase72.sex} info:${ktBase72.info}")
//    ktBase72.name="猪八戒"  name被私有化后不能赋值

}