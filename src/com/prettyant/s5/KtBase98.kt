package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 3:16 PM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//密封类,我们的成员,就必须有类型  并且继承本类
sealed class Exams {
    //todo object? Fraction1 Fraction2 Fraction3 都不需要任何成员,所以一般都写成object
    object Fraction1 : Exams()//分数差
    object Fraction2 : Exams()//分数及格
    object Fraction3 : Exams()//分数良好
    //todo 假设 Fraction4是可以写object,那么也不合理,因为对象不是单例的,比如
    class Fraction4(val studentName: String) :
        Exams()//分数优秀  -- todo  想得到优秀学生的姓名,所以将Fraction4改为class

    //需求  需要得到优秀学生的姓名
//    var studentName: String? = null
    //用枚举类,要做到此需求,就非常麻烦
    //需求: 引出密封类  详见下一节
}

class Teachers(private val exam: Exams) {
    fun show() =
        when (exam) {
            is Exams.Fraction1 -> "该学生成绩很差"
            is Exams.Fraction2 -> "该学生成绩及格"
            is Exams.Fraction3 -> "该学生成绩良好"
            is Exams.Fraction4 -> "该学生成绩优秀: 该学生的姓名是${(this.exam as Exams.Fraction4).studentName}"
            //else ->  由于我们的show函数,是使用枚举类型来做判断处理的,这个就属于代数数据类型了,就不需要写else了
            //因为when 表达式非常明确了,只有这4种类型了,不会出现else其他,所以不需要写了
        }


}

//TODO Kotlin语言的代数数据类型
//1. 定义枚举Exam类,四个级别分数情况
//2. 定义Teacher老师类,when使用枚举类
//3. 需求  得到优秀的孩子姓名
fun main() {
    println(Teachers(Exams.Fraction1).show())
    println(Teachers(Exams.Fraction2).show())
    println(Teachers(Exams.Fraction3).show())
    println(Teachers(Exams.Fraction4("陈菲")).show())
    println(Teachers(Exams.Fraction4("ChenFei")).show())
    println()
    println("result(fraction1) -->> ${Exams.Fraction1}")//1
    println("result(fraction1) -->> ${Exams.Fraction1}")//2   和 1一样
    println("result2(fraction4) -->> ${Exams.Fraction4("AAA")}")//3
    println("result3(fraction4) -->> ${Exams.Fraction4("AAA")}")//4  和3不一样   TODO 3 4两个对象
    println(Exams.Fraction1 == Exams.Fraction1)//true
    println(Exams.Fraction1 === Exams.Fraction1)//true  === 对象引用  object是单例  但只会实例化一次

    println(Exams.Fraction4("AAA") === Exams.Fraction4("AAA"))//false  class 有两个不同的对象,所以是false

    //
}