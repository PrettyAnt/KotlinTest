package com.prettyant.s1


//  TODO kotlin语言的具名函数参数

fun main() {
//    loginAction("prettyant","123321","1592189111111",18)
    loginAction(userName = "prettyant",phoneNum = "123456",age = 19,userPwd = "0000")
}

private fun loginAction(userName: String, userPwd: String, phoneNum: String, age: Int) {
    println("userName:$userName userPwd:$userPwd phoneNum:$phoneNum age:$age")
}