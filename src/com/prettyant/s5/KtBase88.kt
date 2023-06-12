package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:23 AM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
interface RunnableKT{
    fun run()
}
open class KtBase88 {
    open fun add(info: String) = println("add:$info")
    open fun del(info: String) = println("del:$info")
}

// TODO Kotlin语言的对象表达式学习
// 1. add del println
// 2. 匿名对象表达式方式
// 3. 具名实现方式
// 4. 对Java的接口  用对象表达式方式
fun main() {
    //匿名对象「表达式」方式
    println("----- 匿名实现方式 --------")
    val p: KtBase88 = object : KtBase88() {
        override fun add(info: String) {
//            super.add(info)
            println("我是匿名对象  add:$info")
        }

        override fun del(info: String) {
//            super.del(info)
            println("我是匿名对象  del:$info")
        }
    }
    p.add("孙悟空")
    p.del("猪八戒")
    println("----- 具名实现方式 --------")
    val p2 =KtBase88Impl()
    p2.add("张飞")
    p2.del("林冲")
    println("\n ----------\n")
    // TODO: 对 Java 接口
    //对Java的接口  KT对象表达式方式
   val p3= object :Runnable{
        override fun run() {
            println("Runnable run ...")
        }

    }
    p3.run()
    //对Java 的接口  Java最简洁的方式
    val p4= Runnable {
        println("Runnable run2 ...")
    }
    p4.run()

    // TODO: 对 KT接口
    //对KT的接口  KT对象表达式方式
    object : RunnableKT{
        override fun run() {
            println("RunnableKT 方式1 run ...")
        }
    }.run()
    //对KT 的接口  Java最简洁的方式
//    RunnableKT{
//
//    }

}
//todo Java接口有2种方式 : 1、(object : 对象表达式)  2、简洁版
// Kt只有1中方式  1、(object : 对象表达式)
//具名实现  具体名字 == KtBase88Impl
class KtBase88Impl : KtBase88() {
    override fun add(info: String) {
//            super.add(info)
        println("我是具名对象  add:$info")
    }

    override fun del(info: String) {
//            super.del(info)
        println("我是具名对象  del:$info")
    }
}

