package com.prettyant.practice

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 2:20 PM  15/06/23
 * PackageName : com.prettyant.practice
 * describle :
 */
data class UserInfo(var age: Int, var name: String)
data class StudentInfo(var age: Int, var name: String)

fun main() {
//    println(test1(true, UserInfo(150, "chenyu")) { a: UserInfo ->
//        "输出结果为:$a"
//    })

    println(changeBean(true, UserInfo(728, "chenfei")) {
        StudentInfo(it.age, it.name)
    })
}

fun test1(open: Boolean, userInfo: UserInfo, params: (UserInfo) -> String): String {
    val any = params(userInfo).takeIf {
        open
    } ?: "不满足takIf里面的条件啊.."
    return any
}

fun changeBean(open: Boolean, userInfo: UserInfo, params: (UserInfo) -> StudentInfo): Any {
    val studentInfo = params(userInfo).takeIf {
        open
    } ?: "不满足takeIf里面的条件哦 ........."
    return studentInfo

}
