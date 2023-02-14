package com.prettyant.s2

//TODO Kotlin语言函数引用的学习
fun main() {
    //函数引用
    //lambda属于函数类型的对象，需要把methodResponseResult普通函数变成函数类型的对象(函数引用)
    login("PrettyAnt", "123456", ::methodResponseResult)

//    val obj=::methodResponseResult
//    login("PrettyAnt", "123456", obj)

//    等价于
//    login("PrettyAnt", "123456") { msg: String, code: Int ->
//        println("最终登录的结果是 msg:$msg code:$code")
//    }
}

fun methodResponseResult(msg: String, code: Int) {
    println("最终登录的成果是:msg$msg code:$code")
}

//模拟: 数据库SQLServer
const val USER_NAME_SAVE_DB4 = "PrettyAnt"
const val USER_PWD_SAVE_DB4 = "123456"

inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (USER_NAME_SAVE_DB4 == name && pwd == USER_PWD_SAVE_DB4) {
        responseResult("登录成功", 200)
    } else {
        responseResult("登录失败", 444)
    }

}
