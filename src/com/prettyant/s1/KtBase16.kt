package com.prettyant.s1


//  TODO kotlin 语言的函数头学习

fun main() {
    println("函数的返回值---->>>> "+method01(26, "wangbei"))

}

//函数默认都是public
//其实Kotlin的函数，更规范，先有输入，再有输出
private fun method01(age: Int, name: String): Int {
    println("你的姓名是$name 年龄是 $age")
    return 200
}

//--->>>转换为lamba表达式
val method:(String,Int)->Int={ name: String, age: Int ->
    println("你的姓名是$name 年龄是 $age")
    200
}

val method02: (String) -> String = {
    "$it PrettyAnt"
}



/**
 * 上面的Kotlin函数，背后会变成下面的Java代码:
 *  private static final int method01(int age,String name){
 *      String var2="你的姓名是:"+ name + ",你的年龄是:" + age;
 *      Systen.out.println(var2)
 *      return 200;
 *  }
 */