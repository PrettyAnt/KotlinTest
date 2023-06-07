package com.prettyant.s3

import java.io.File
import java.util.*


//TODO Kotlin语言的 takeIf 内置函数  -- 一般情况下，takdIf + 空合并操作符一起使用
//"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
fun main() {
    val result = checkPermissionAction("chenyu", "123456")
    println(result)
    if (result != null) {
        println("拥有权限,userName: $result")
    } else {
        println("无权限")
    }

    println("------------------")

    println(checkPermissionAction2("chenyu","123456"))



}

//前端校验系统
public fun checkPermissionAction(userName: String, userPassWord: String): String? {
  return userName.takeIf { permissionSystem(userName,userPassWord) }

}
//前端校验系统2
public fun checkPermissionAction2(userName: String, userPassWord: String): String {
    return userName.takeIf { permissionSystem(userName,userPassWord) } ?:"无权限2"

}

//权限系统
fun permissionSystem(userName: String, userPassWord: String): Boolean {
    return if (userName == "root" && userPassWord == "123456") true else false
}


