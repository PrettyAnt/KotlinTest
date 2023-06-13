package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 2:30 PM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//四肢信息class   为了方便打印
data class LimbsInfo(var limbsName: String, var legth: Int) {
    fun show() {
        println("${limbsName}的长度是$legth")
    }
}

enum class Limbs(private var limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 88)),//左手
    RIGHT_HAND(LimbsInfo("右手", 88)),//右手
    LEFT_FOOT(LimbsInfo("左脚", 188)),//左脚
    RIGHT_FOOT(LimbsInfo("右脚", 188));//右脚

    //1. WEEK这个时候 再定义单调的枚举值,就报错了,必须所有枚举值,保持一致的形式
    //2. 枚举的主构造的参数必须和枚举的参数保持一致
    fun show() = "四肢是:${limbsInfo.limbsName} 的长度是:${limbsInfo.legth}"

    fun updateData(limbsInfo: LimbsInfo) {
        println("--->> 更新前的数据是:${this.limbsInfo}")
        this.limbsInfo.limbsName = limbsInfo.limbsName
        this.limbsInfo.legth = limbsInfo.legth
        println("更新后的数据:${this.limbsInfo}")
    }
}

//TODO Kotlin语言的枚举类定义函数学习
fun main() {
    //显示枚举值
//    println(Limbs.show())   println(Limbs().show())  //一般不会这么用
    //一般的用法如下:
    println(Limbs.LEFT_HAND.show())
    println(Limbs.RIGHT_HAND.show())
    println(Limbs.LEFT_FOOT.show())
    println(Limbs.RIGHT_FOOT.show())
    //更新枚举值
    Limbs.RIGHT_HAND.updateData(LimbsInfo("右手222",128))
    Limbs.LEFT_HAND.updateData(LimbsInfo("左手222",128))
    Limbs.RIGHT_FOOT.updateData(LimbsInfo("左脚222",198))
    Limbs.LEFT_FOOT.updateData(LimbsInfo("左脚222",198))
    println(Limbs.RIGHT_HAND.show())
}