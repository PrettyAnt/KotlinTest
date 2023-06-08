package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
// TODO Kotlin语言的集合转换与快捷函数学习
// 1.定义可变list集合
// 2.List转Set去重
// 3.List转Set转List也能去重
// 4.快捷函数去重 distinct
fun main() {
    val list = mutableListOf("孙悟空", "孙悟空", "唐僧", "猪八戒", "白龙马")//list 可以重复元素

    //List 转 Set 去重
    val set = list.toSet()
    println(set)
    //List转Set转List也能去重
    val list2 = list.toSet().toList()
    println(list2)
    //快捷函数去重 distinct
    val list3 = list.distinct()//内部转化为可变的set集合，再转换为list  等价与 println(list.toMutableSet().toList())
    println(list3)
}