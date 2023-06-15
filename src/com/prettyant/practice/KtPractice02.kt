package com.prettyant.practice

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 2:20 PM  15/06/23
 * PackageName : com.prettyant.practice
 * describle :
 */
data class UserInfo(var age: Int, var name: String)

fun main() {
    println(test2(true, UserInfo(150,"chenyu")) { a: UserInfo ->
        "输出结果为:$a"
    })
}

fun test2(open: Boolean,userInfo: UserInfo, params: (UserInfo) -> String) :String{
    val any = params(userInfo).takeIf {
        open
    } ?: "不满足takIf里面的条件啊.."
    return any
}
