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

//    println(changeBean(true, UserInfo(728, "chenfei")) {
//        StudentInfo(it.age, it.name)
//    })

//    println(changeBeanT(true, UserInfo(888, "chenfei")) {
//        StudentInfo(it.age, it.name)
//    })

    val result = changeBeanplus(true, UserInfo(999, "chenyu")) {
        StudentInfo(it.age, it.name)
    }?:" 结果为空啊 ... "
    println(result)

    println(changeBeanplus(true, 666) {
        "int -> String  [result:$it]"
    })
    println(changeBeanplus(true, "701") {
        it.toInt()
    })

}


inline fun changeBean(open: Boolean, userInfo: UserInfo, params: (UserInfo) -> StudentInfo): Any {
    val studentInfo = params(userInfo).takeIf {
        open
    } ?: "不满足takeIf里面的条件哦 ........."
    return studentInfo
}

inline fun <T, O> changeBeanT(open: Boolean, t: T, params: (T) -> O): Any {
    val any = params(t).takeIf {
        open
    } ?: "泛型,不满足takeIf里面的条件....."
    return any
}

inline fun <T, O> changeBeanplus(open: Boolean, t: T, params: (T) -> O): O? =
    if (open) params(t) else null
