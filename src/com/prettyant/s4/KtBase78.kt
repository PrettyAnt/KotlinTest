package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:34 PM  9/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
class KtBase78 {
    //可读可改，所以不能为lateinit val
    lateinit var responseResultInfo: String//先初始化

    //模拟服务器加载
    fun load() {//延时初始化，属于懒加载
        responseResultInfo="服务器加载成功..."

    }
    fun showResponseResult() {
        //如果没有初始化，使用就会奔溃
//        println("responseResultInfo  -->>  $responseResultInfo")
        //是否初始化
        if (::responseResultInfo.isInitialized) {
            println("responseResultInfo  -->>  $responseResultInfo")
        } else {
            println("----->>>>  未初始化")
        }
    }
}

// TODO Kotlin语言的延迟初始化lateinit
//  1.lateinit responseResultInfo 定义
//  2.request 懒加载
//  3.showResponseResult
//  4.main 先请求  再显示
fun main() {
    val ktBase78 = KtBase78()
    //加载
//    ktBase78.load()
    //显示
    ktBase78.showResponseResult()

}