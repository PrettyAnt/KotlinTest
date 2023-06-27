package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
class KtBase79 {
    //   >>>>>>>>>>>>>>>>>>>下面是不使用惰性初始化 普通方式(饿汉式)
    val databaseData1 = readSQLServerDatabaseAction()


    //   >>>>>>>>>>>>>>>>>>>下面是使用惰性初始化 by lazy
    val databaseData2 by lazy {
        readSQLServerDatabaseAction()
    }

    private fun readSQLServerDatabaseAction(): String {
        println("加载读取数据库数据中......")
        return "database date load success"
    }
}

// TODO Kotlin语言的惰性初始化by lazy学习
//  1.不使用惰性初始化 databaseData1 = readSQLServerDatabaseAction()
//  2.使用惰性初始化  databaseData2 by lazy
//  3.KtBase79 睡眠 db1.databaseData1

//  lateinit 在使用的时候，手动加载的懒加载方式，然后再使用
//  惰性初始化 by lazy  在使用的时候，自动加载的懒加载方式，然后再使用
fun main() {
//    val ktBase79 = KtBase79()
//    Thread.sleep(5000)
//    println("即将开始使用")
//    println("最终显示:${ktBase79.databaseData1}")

    val ktBase79 = KtBase79()
    Thread.sleep(5000)
    println("即将开始使用")
    println("最终显示:${ktBase79.databaseData2}")
}