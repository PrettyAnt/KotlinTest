package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:52 PM  13/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
class KtBase103<T>(private val obj: T) {
    //万能输出器
    fun show() = println("万能输出器:$obj")

}

data class Student(val name: String, val age: Int, val sex: Char)
data class Teacher(val name: String, val age: Int, val sex: Char)

//TODO Kotlin语言的定义[泛型类]
//1. 定义对象输出器 println(obj)
//2. 定义两个对象, 三个属性
//3. 对象 String Int Double Float Char 等测试  对象输出器
fun main() {
    val student1 = Student("孙悟空", 888, 'M')
    val student2 = Student("猪八戒", 666, 'M')
    val teacher1 = Teacher("唐僧", 9898, 'F')
    val teacher2 = Teacher("菩提老祖", 9999998, 'M')
    KtBase103(student1).show()
    KtBase103(student2).show()
    KtBase103(teacher1).show()
    KtBase103(teacher2).show()

    KtBase103(String("come on ~".toByteArray())).show()
    KtBase103(138).show()
    KtBase103(108.5).show()
    KtBase103(140.08f).show()
    KtBase103('F').show()

}
