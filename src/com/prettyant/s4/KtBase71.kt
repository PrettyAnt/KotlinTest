package com.prettyant.s4

import java.util.*

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的计算属性与防范竞态条件

class KtBase71 {
    val number: Int = 100
    /*  背后代码

         public final int getNumber() {
           return this.number;
        }
     */

    //计算属性   下面这样写 get函数覆盖了field内容本身，相当于field失效了
    val number2: Int
        get() = (1..1000).shuffled().first()//从1到1000取随机值 返回给getNumber2函数
    /*  背后代码
        为什么没有看到number2？
        因为属于计算属性的功能，根本在getNumber2函数里面，就没有用到number2属性，所以number2属性失效了

       public final int getNumber2() {
             byte var1 = 1;
            return ((Number)CollectionsKt.first(CollectionsKt.shuffled((Iterable)(new IntRange(var1, 1000))))).intValue();
       }
     */

    //todo 防范竞态条件
    var info: String? = ""

    //防范竞态条件   当你调用成员，这个成员，可能为null,可能为空值，就必须采用 防范竞态条件，这个是KT编程的规范话
    fun getShowInfo(): String {
        //这个成员，可能为null，可能为空值，就启用防范竞态条件
        //这种写法: 就属于防范竞态条件
        return info?.let {
            if (it.isEmpty()) {
                "info 的值为空值，请检查代码"
            } else {
                "最终info结果是:$it"
            }
        } ?: "info 为null,请检查代码"
    }

}

//main被 class KtBase71Kt{    } 包裹
fun main() {
    println(KtBase71().number)
//    KtBase71().number=88   //报错原因: val 没有set函数,只有get函数  (number被val修饰了，所以是final类型)
    println(KtBase71().number2)

    //  背后隐式代码  System.out.println(new KtBase71().getShowInfo());
    println(KtBase71().getShowInfo())
}