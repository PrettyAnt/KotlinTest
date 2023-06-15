package com.prettyant.practice

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:14 PM  14/06/23
 * PackageName : com.prettyant
 * describle :
 * todo: 自己随便写的小练习
 */
/**
 * 定义一个函数
 * name : 接收到的参数1,类型为String
 * method: 接收到的参数2,类型为 (Int) -> String  todo  这个参数也可以理解成接口对象,这个类型就是一个接口
 * 无返回结果,所以为Unit
 *   todo 也可以定义返回结果
 *
 */
//todo 方式一
//  fun methodAction1(name: String, method: (Int) -> String): Unit {
//       println("name -->> $name method:${method(999)}")
// }

fun methodAction1(name: String, method: (Int) -> String) =
    println("name -->> $name method:${method(999)}")

fun main() {
    //todo 方式一
    val method1: (Int) -> String = { info: Int ->
        "输入的信息为:$info"
    }
    methodAction1("孙悟空", method1)

    //todo 方式二
    methodAction1("孙悟空") { info: Int ->
        "输入的信息为:$info"
    }

    //todo 方式三
    methodAction1("孙悟空") {
        "输入的信息为:$it"
    }
}