package com.prettyant.s1


//  TODO kotlin语言的反引号中的函数名特点

fun main() {
    //第一种情况
    `2022年6月26日认真学习kotlin`("PrettyAnt",29)

    //第二种情况
    //in is 在kotlin里面就是关键字，怎么办呢?使用反引号
//    KtBase21.is()
    KtBase21.`is`()
    KtBase21.`in`()

    //第三种情况
    //很少发生   对应公司的提供的某个方法
    `789098767894567`()
}

private fun `2022年6月26日认真学习kotlin`(name: String, pwd: Int) {
    println("学习的人是$name 学习的密码是$pwd")
}

private fun `789098767894567`(){
    //写了很复杂的功能，核心功能
    //...
}
//公司加密私有的文档   789098767894567 ==== 此函数的作用 xxx
//公司加密私有的文档   003480295820385 ==== 此函数的作用 xxx

