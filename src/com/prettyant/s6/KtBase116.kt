package com.prettyant.s6

//TODO Kotlin语言的标准函数与泛型扩展函数[手写let函数]
fun main() {
    "PrettyAnt".mLet {
        it
        true
        "OK"
    }
    val mLet = 123.mLet {
        "传入的参数为:$it"
    }
    'C'.mLet {  }
    //万能类型,任何类型,所有类型,都可以使用我的mLet
    //..

    println(mLet)
}
//todo
//  private 私有化
//  inline 我们的函数是高阶函数,,所以用到内联,做lambda的优化,性能更高
//  fun<I,O>在函数中,申明两个泛型  I输入 Input  O输出  Output
//  I.mLet 对I输入Input进行函数扩展,扩展函数的名称是 mLet,意味着,所有的类型,万能类型,都可以用 xxx.mLet
//  lambda:(I) -> O  (I输入参数) -> O输出
//   :O 会根据用户的返回类型变化而变化
//  lambda(this)  I进行函数扩展,在整个扩展函数里面  this == I 本身
private inline fun <I, O> I.mLet(lambda: (I) -> O): O = lambda(this)

