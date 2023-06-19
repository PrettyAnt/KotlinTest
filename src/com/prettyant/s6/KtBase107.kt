package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 1:58 PM  19/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
//为什么 it 是String? ,是因为你的 lambda(T?) -> R 指定了
class KtBase107<T>(vararg objects: T, var isMap: Boolean) {
    // 1.objectArray:Array<T>
    //out 我们的T只能被  获取,不能修改  T只能读取
    val objectArray: Array<out T> = objects

    //2.showObj(index)
    fun showObj(index: Int): T? = objectArray[index].takeIf { true } ?: null
//    fun showObj(index: Int): T = objectArray[index]

    //3.mapObj(index,变换lamba)
    fun <R> mapObj(index: Int, mapAction: (T?) -> R): R? =
        mapAction(objectArray[index].takeIf { isMap })
}

//TODO Kotlin语言的vararg关键字(动态参数学习)
//  1.objectArray:Array<T>
//  2.showObj(index)
//  3.mapObj(index,变换lamba)
//  4.p.showOBJ p.mapObj(int -> str)
//  5.p的类型  it的类型
fun main() {
    //p 的类型 ?
    //由于使用了太多的类型的混合了,泛型   这个才是真正的类型: KtBase107< {Comparable<*> & java.io.Serializable} >    fixme (老师讲的不一定对)
    //由于不允许我们这样写 KtBase107< {Comparable<*> & java.io.Serializable} >    所以用父类Any代替
    val p: KtBase107<Any?> = KtBase107("prettyant", false, 666, 668.8f, null, 'C', isMap = true)
    println(p.showObj(0))
    println(p.showObj(1))
    println(p.showObj(2))
    println(p.showObj(3))
    println(p.showObj(4))// null
    println(p.showObj(5))// C
    println()

    //mapObj
    val r: Int? = p.mapObj(0) {
        it
        it.toString()
        it.toString().length
    }
    println("第 0 个元素的字符串长度为:$r")

    val r1: String? = p.mapObj(2) {
        "第 3 个元素为:$it"
    }
    println(r1)

    //   --------------------------------------------------------
    println()

    val p2: KtBase107<String> = KtBase107("AAA", "BBB", "CCC", "DDD", isMap = true)
    // 如果lambda返回类型是 O R 泛型
    val r3: String? = p2.mapObj(3) {
        it
    }
    println(r3)

}