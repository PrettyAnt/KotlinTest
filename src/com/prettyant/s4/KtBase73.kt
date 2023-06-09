package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */

// TODO Kotlin语言的主构造函数里定义属性
class KtBase73(var _name: String, var _sex: Char, val _age: Int, var _info: String) {
/*   相当于
    public KtBase73(@NotNull String _name, char _sex, int _age, @NotNull String _info) {
        this._name = _name;
        this._sex = _sex;
        this._age = _age;
        this._info = _info;
    }*/

    //主构造函数
    fun show() {
        println("name:${_name} age:${_age}  sex:${_sex} info:${_info}")
    }
}

fun main() {
    val ktBase73 = KtBase73(_name = "唐僧", _age = -43, _sex = 'M', _info = "金蝉子")
    ktBase73.show()
}