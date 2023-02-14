package com.prettyant.s2

//TODO 在函数中定义参数是函数的函数
/**
 * kotlin版模拟客户端请求后台接口登录功能
 */
fun main() {
   loginAPI("PrettyAnt", "123456") { msg: String, code: Int ->
        println("最终登录的情况如下: msg:$msg code:$code")
    }


}

//模拟: 数据库SQLServer
const val USER_NAME_SAVE_DB = "PrettyAnt"
const val USER_PWD_SAVE_DB = "123456"

//登录API 模仿前端
fun loginAPI(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名或密码为null")//出现问题，终止程序
    }
    //做很多的校验 前端校验
    if (userName.length > 3 && userPwd.length > 3) {
        if (webServerLoginAPI(userName, userPwd)) {
            //登录成功
            //做很多事情 ..
            responseResult("login success", 200)
        } else {
            //登录失败的逻辑处理
            //做很多事情 ..
            responseResult("login error", 444)
        }
    } else {
        TODO("用户名或密码不合格")
    }
}

//登录API暴露着 服务器
private fun webServerLoginAPI(name: String, pwd: String): Boolean {
    //登录逻辑处理
    //..
    return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB
    //或者   return if (name== USER_NAME_SAVE_DB&& pwd==USER_PWD_SAVE_DB) true else false
    /*   //kotlin的if是表达式(比较灵活) java的if是语句(局限性)
       if (name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB) {
           return true
       } else {
           return false
       }*/
}