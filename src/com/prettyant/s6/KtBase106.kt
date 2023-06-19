package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 10:55 AM  19/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
open class MyAnyClass(name: String)//顶级父类
open class PersonClass(name: String) : MyAnyClass(name = name)//父类
class StudentClass(name: String) : PersonClass(name = name)//子类
class TeacherClass(name: String) : PersonClass(name = name)//子类
class DogClass(name: String)//其他类

//TODO Kotlin语言的泛型约束学习
//  T:PersonClass 相当于 Java的 T extends PersonClass
//  PersonClass 本身 与 PersonClass的所有子类  都可以使用,其他的类,都不能兼容此泛型
class KtBase106<T:PersonClass>(val inputTypeValue: T, private val isB: Boolean = true) {
    //对象返回器
    fun getObj(): T? = inputTypeValue.takeIf { isB }

}

fun main() {
    val any = MyAnyClass("prettyant")//顶级父类
    val per = PersonClass("prettyant")//父类

    val stu = StudentClass("prettyant")//子类
    val tea = TeacherClass("prettyant")//子类

    val dog = DogClass("prettyant")//其他类

/*    val r1: MyAnyClass? = KtBase106(any).getObj()
    println(r1)*/

    val r2: MyAnyClass? = KtBase106(per).getObj()
    println(r2)

    val r3: MyAnyClass? = KtBase106(stu).getObj()
    println(r3)

    val r4: MyAnyClass? = KtBase106(tea).getObj()
    println(r4)

/*    val r5 = KtBase106(dog).getObj()
    println(r5)*/
}