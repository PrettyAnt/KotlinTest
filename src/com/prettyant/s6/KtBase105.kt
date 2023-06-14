package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 3:55 PM  14/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
//1.类  isMap  map  takeIf  map 是什么类型
class KtBase105<T>(val isMap: Boolean = false, val inputType: T) {

    //模仿RxJava  T是要变化的模型   R是变换后的输出类型
    //要求map返回的类型是R?
    inline fun <R> map(mapAction: (T) -> R): R?/*有可能是R,有可能是null,所以定义为 R? ,也可以不写 */ =
        mapAction(inputType).takeIf { isMap }
}

//TODO Kotlin语言的泛型转换实战  [类似RxJava]
//1.类  isMap  map  takeIf  map 是什么类型
//2.map int -> str 最终接收是什么类型
//3.map per -> stu 最终接收是什么类型
//4.验证是否是此类型 与 null
fun main() {
    //2.map int -> str 最终接收是什么类型
    val p1 = KtBase105<Int>(isMap = false, inputType = 32432)
    val r = p1.map {
        it
        "it:$it"
        it.toString()
    }
    //4.验证是否是此类型 与 null
    println(r is String)
    println(r is String?)
    println(r)
    println(r ?: "结果为null...")
    println("-------------------------")
    //3.map per -> stu 最终接收是什么类型
    val p2 = KtBase105(true, Persons("孙悟空", 9999))
    val r2: Students? = p2.map {
        //it ==Persons 对象 == inputType
        it
        Students(it.name, it.age)
    }
    println(r2)
    println("[高级写法]-------------------重新定义一个map函数去实现-----------------")
    //map 函数模仿RxJava的变换操作
    val map :String?= map(110) {
        it.toString()
        "map包裹 [$it]"
    }
    println(map)
}

//inline fun <I, O> map(isMap: Boolean = true, mapActionLamba: (I) -> O) {
//
//}
inline fun <I, O> map(inputValue: I, isMap: Boolean = true, mapActionLamba: (I) -> O): O? =
    if (isMap) mapActionLamba(inputValue) else null

data class Persons(val name: String, val age: Int)
data class Students(val name: String, val age: Int)