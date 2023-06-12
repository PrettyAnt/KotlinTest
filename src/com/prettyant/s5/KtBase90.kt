package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:26 PM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//TODO 内部类
//  内部类的特点: 内部的类  能访问外部的类
//              外部的类  能访问内部的类
class Body(_bodyInfo: String) {
    //身体类
    val bodyInfo = _bodyInfo
    fun show() {
        Heart().run()
    }

    //默认情况下：内部的类不能访问外部的类，要增加修饰符inner成为内部类才可以访问外部类
    inner class Heart {
        //心脏类
        fun run() = println("心脏访问身体信息:$bodyInfo")
    }

    inner class Kidney {
        //肾脏
        fun run() = println("肾脏访问身体信息:$bodyInfo")
    }

    inner class Hand {
        //手
        inner class LeftHand {
            //左手
            fun run() = println("左手访问身体信息:$bodyInfo")
        }

        inner class RightHand {
            //右手
            fun run() = println("右手访问身体信息:$bodyInfo")
        }
    }
}

//TODO 嵌套类
//  默认情况下，是嵌套关系
//  嵌套类特点:  外部的类  能访问内部的嵌套类
//  fixme            内部的类  能访问外部类的成员
//
class Outer {
    val info: String = "OK"
    fun show(){
        Nested().output()
    }
    class Nested{
        fun output()= println("嵌套类")

//        fun output()= println(info)  //fixme error
    }
}

//TODO Kotlin 语言的嵌套类学习  ---  这一节老师讲的不一定对
fun main() {
    //内部类:
    Body("isOK").Heart().run()
    Body("isOK").Hand().LeftHand().run()
    Body("isOK").Hand().RightHand().run()
    Body("isOK").Kidney().run()
    println("----------")
    //嵌套类:
    Outer.Nested().output()
    Outer().show()


}