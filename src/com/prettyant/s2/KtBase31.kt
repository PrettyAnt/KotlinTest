package com.prettyant.s2

//TODO 在函数中定义参数是函数的函数
/**
 * kotlin版模拟客户端请求后台接口登录功能-历史演变
 */
fun main() {
    loginAPI3("PrettyAnt", "123456") { msg: String, code: Int ->
        println("最终登录的情况如下: msg:$msg code:$code")
    }
}

//模拟: 数据库SQLServer
const val USER_NAME_SAVE_DB3 = "PrettyAnt"
const val USER_PWD_SAVE_DB3 = "123456"

//此函数没有使用lambda,就不需要声明内联
//如果此函数不使用内联，在调用端，会生成多个对象来完成lambda的调用(会造成性能损耗)
//如果此函数使用内联，相当于c++ #define 宏定义 宏替换 ,会把代码替换到调用处，没有任何函数开辟，对象开辟的损耗  (可以查看转换的byteCode,如:可以看到(Function2)null.INSTANCE)
//小结：如果函数参数有lambda,尽量使用inline关联关键字，这样内部会做优化，减少 函数开辟 对象开辟 的损耗
//登录API 模仿前端
public inline fun loginAPI3(userName: String, userPwd: String, responseResult: (String, Int) -> Unit) {
    if (userName == null || userPwd == null) {
        TODO("用户名或密码为null")//出现问题，终止程序
    }
    //做很多的校验 前端校验
    if (userName.length > 3 && userPwd.length > 3) {
        if (webServerLoginAPI3(userName, userPwd)) {
            //登录成功
            responseResult("login success", 200)
        } else {
            //登录失败的逻辑处理
            responseResult("login error", 444)
        }
    } else {
        TODO("用户名或密码不合格")
    }
}

//此函数没有使用lambda,就不需要声明内联
//登录API暴露着 服务器
 fun webServerLoginAPI3(name: String, pwd: String): Boolean {
    return name == USER_NAME_SAVE_DB3 && pwd == USER_PWD_SAVE_DB3
}