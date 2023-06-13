package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:22 AM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//TODO Kotlin语言的解构声明学习
class Student1(var name: String, var age: Int, var sex: Char) {
    //注意事项:component0 顺序必须是component1  component2  component3 和成员一一对应,顺序下来的
    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex

}
data class Student1Data(var name: String, var age: Int, var sex: Char)
fun main() {
    val (name, age, sex) = Student1("孙悟空", 99, 'M')
    println("普通类 解构后 --->> name:$name,age:$age,sex:$sex")
    val (name1, age1, sex1) = Student1Data("孙悟空", 99, 'M')
    println("数据类 解构后 --->>> name1:$name1,age1:$age1,sex1:$sex1")
    val (_, age2, _) = Student1Data("孙悟空", 99, 'M')
    println("数据类 拒收 解构后 --->>>  age2:$age2")

}