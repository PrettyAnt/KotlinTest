package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:44 AM  14/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
//1.万能对象返回器 Boolean来控制是否返回  运用 takeIf
class KtBase104<T>(private val isR: Boolean, private val obj: T) {
    fun getObj() = obj.takeIf { isR }
}

// TODO Kotlin语言的[泛型函数]学习
//  1.万能对象返回器 Boolean来控制是否返回  运用 takeIf
//  2.四个对象打印
//  3.对象打印 + run + ?:
//  4.对象打印 + apply + ?:
//  5.show(t : T) + apply +?:
fun main() {

    val student1 = Student("孙悟空", 888, 'M')
    val student2 = Student("猪八戒", 666, 'M')
    val teacher1 = Teacher("唐僧", 9898, 'F')
    val teacher2 = Teacher("菩提老祖", 9999998, 'M')
    //2.四个对象打印
    println(KtBase104(true, student1).getObj())
    println(KtBase104(true, student2).getObj())
    println(KtBase104(true, teacher1).getObj())
    println(KtBase104(false, teacher2).getObj() ?: "万能对象返回器返回的是null")
    //  3.对象打印 + run + ?:
    val r: Any = KtBase104(true, student1).getObj()?.run {
//        println(this)
        //如果getObj 返回有值 ,就会进来
        //this == info本身
        println("万能对象是:$this")
        88
    } ?: println("万能对象返回器返回的是null 666")
    println(r)

    //apply特点:永远都是返回info.apply info本身
    val stu: Student? = KtBase104(true, student2).getObj().apply { }
//    val stu2: Student = KtBase104(true, student2).getObj().apply { }!!
    println("stu --->>>  $stu")


    //  4.对象打印 + apply + ?:
    val stu3: Student = KtBase104(true, student2).getObj()?.apply {
        if (this == null) {
            println("返回的结果为空.....")
        } else {
            println("万能的对象是:$this")
        }
    }!!
    println("stu3 --->>>  $stu3")
    show("PrettyAnt")
    show(null)
    println("--------------------")
    show2(null)
}

//  5.show(t : T) + also +?:
fun <S> show(item: S) {
    val result: Any = item?.also {
        //it == item本身
        println("返回的结果:$it")
    } ?: println("@ 返回的结果为空.......")

}

fun <S> show2(item: S) {
    val result: S? = item?.also {
        //it == item本身
        if (it == null) {
            println("@@ 返回的结果为空.......")
        } else {
            println("返回的结果:$it")
        }
    } ?: null

}