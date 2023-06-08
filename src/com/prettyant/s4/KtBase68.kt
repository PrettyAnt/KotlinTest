package com.prettyant.s4

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的遍历Map学习
// 4种方式遍历
fun main() {
    val map /*: Map<String, Double>*/ = mapOf("孙悟空" to 50.0, "唐僧" to (80.0), "猪八戒" to 40.0)
    println("------------方式2-----------\n")
    //第一种方式：
    map.forEach {
        //it == 每一个元素    K 和 V
        //it 类型  Map.Entry<String,Int>
        println("key:${it.key}  value:${it.value}")// todo 结果 --> key:孙悟空  value:50.0    key:唐僧  value:80.0    key:猪八戒  value:40.0

    }
    println("------------方式2-----------\n")
    //第二种方式  把默认的it给覆盖了
    map.forEach { key, value ->
        println("key:$key  value:$value")// todo 结果 --> key:孙悟空  value:50.0    key:唐僧  value:80.0    key:猪八戒  value:40.0
    }
    println("------------方式3-----------\n")
    //第三种方式
    map.forEach { (k, v) ->
        println("key:$k  value:$v")// todo 结果 --> key:孙悟空  value:50.0    key:唐僧  value:80.0    key:猪八戒  value:40.0
    }
    println("------------方式4-----------\n")
    //第四种方式   for循环
    for (item /*: Map.Entry<String, Double>*/ in map) {
        println("key:${item.key}   value:${item.value}")
    }

}