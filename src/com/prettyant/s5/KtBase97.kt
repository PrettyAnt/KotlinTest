package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 3:16 PM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
enum class Exam {
    Fraction1,//分数差
    Fraction2,//分数及格
    Fraction3,//分数良好
    Fraction4;//分数优秀

    //需求  需要得到优秀学生的姓名
    var studentName: String? = null
    //用枚举类,要做到此需求,就非常麻烦
    //需求: 引出密封类  详见下一节
}

class Teacher(private val exam: Exam) {
    fun show() =
        when (exam) {
            Exam.Fraction1 -> "该学生成绩很差"
            Exam.Fraction2 -> "该学生成绩及格"
            Exam.Fraction3 -> "该学生成绩良好"
            Exam.Fraction4 -> "该学生成绩优秀"
            //else ->  由于我们的show函数,是使用枚举类型来做判断处理的,这个就属于代数数据类型了,就不需要写else了
            //因为when 表达式非常明确了,只有这4种类型了,不会出现else其他,所以不需要写了
        }


}

//TODO Kotlin语言的代数数据类型
//1. 定义枚举Exam类,四个级别分数情况
//2. 定义Teacher老师类,when使用枚举类
//3. 需求  得到优秀的孩子姓名
fun main() {
    println(Teacher(Exam.Fraction4).show())
    println(Teacher(Exam.Fraction3).show())
    //
}