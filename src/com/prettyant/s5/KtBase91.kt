package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:59 PM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//普通类
class ResponseResultBean1(var msg: String, var code: Int, var data: String)
//set get 构造函数

//数据类  --  一般用于JavaBean的形式下，用数据类
data class ResponseResultBean2(var msg: String, var code: Int, var data: String)
//set get 构造函数  解构操作  copy toString  hashCode  equals

//TODO Kotlin 语言的数据类学习
// 1、普通类与数据类toString 背后原理
// 2、前面学习过的 == 与 ===
// 3、普通类 == 背后原理
// 4、数据类的 == 背后原理
fun main() {
    //val(v1,v2,v3)=list 这个是之list 集合之前的解构操作
    println(ResponseResultBean1("loginSuccess", 200, "登录成功..."))
    //普通类： Any() toString Windowns实现打印了  com.prettyant.s5.ResponseResultBean1@29453f44

    println(ResponseResultBean2("loginSuccess", 200, "登录成功..."))
    //数据类: Any() 默认重写了 父类的 toString  打印子类toString()详情   ResponseResultBean2(msg=loginSuccess, code=200, data=登录成功...)
    println()
    //===================
    //前面学习的 == 值的比较  相当java的equals    === 引用 对象   比较

    println(//推理 两个普通类的值 是一样的，应该是true,实际背后并不是这样的
        ResponseResultBean1("loginSuccess", 200, "登录成功...") ==
                ResponseResultBean1("loginSuccess", 200, "登录成功...")//false
    )//Any() 父类的equals实现    (ResponseResultBean1对象引用比较  ResponseResultBean1 对象引用)

    println(
        ResponseResultBean2("loginSuccess", 200, "登录成功...") ==
                ResponseResultBean2("loginSuccess", 200, "登录成功...")//true
    )//  Any() 父类的 equals 被数据类重写equals 会调用子类equals函数  (对值的比较)
}