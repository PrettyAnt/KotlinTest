package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的可变Map集合学习
// 1. 可变集合的操作  +=   put
// 2. getOrPut  没有的情况
// 3. getOrPut  有的情况
fun main() {
    //1. 可变集合的操作  +=   put
    val map /*: MutableMap<String,Double> */ =
        mutableMapOf("孙悟空" to 50.0, "唐僧" to (80.0), Pair("猪八戒", 40.0))
    map += "AAA" to (99.9)
    map += "BBB" to 86.68
    map -= "唐僧"
    map["CCC"] = 6868.88
    map.put("DDD", 6666.88)//和 []等价，建议使用[]
    println(map)
    println("-------有-------")
    // 2. getOrPut  没有的情况
    map.getOrPut("FFF"){38324.66}//如果整个map集合没有key为"FFF"的元素，就先添加"FFF"元素
    println(map)

    println("-------无-------")
    // 3. getOrPut  有的情况
    map.getOrPut("孙悟空"){222.8}
    println(map)
}