package com.prettyant.s4

import java.io.File

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的「数组」类型
// Kotlin 语言中的各种数据类型，虽然是引用类型，背后可以编译成Java基本类型
//  IntArray        intArrayOf
//  DoubleArray     doubleArrayOf
//  LongArray       longArrayOf
//  ShortArray      shortArrayOf
//  ByteArray       byteArrayOf
//  FloatArray      floatArrayOf
//  BooleanArray    booleanArrayOf
//  Array           arrayOf             对象数组
//
//  1.inArrayOf   常规操作的越界奔溃
//  2.elementAtOrElse  elementAtOrNull
//  3.List集合转  数组
//  4.arrayOf    Array<File>
fun main() {
    //1.inArrayOf   常规操作的越界奔溃
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    println(intArray[0])
    println(intArray[1])
    println(intArray[2])
    println(intArray[3])
    println(intArray[4])
//    println(intArray[5])//会奔溃
    println("-------------")

//    2.elementAtOrElse  elementAtOrNull
    println(intArray.elementAtOrElse(0) { -1 })
    println(intArray.elementAtOrElse(5) { -1 })

    println("-------------")
    println(intArray.elementAtOrNull(0))
    println("空合并:${intArray.elementAtOrNull(5) ?: "你越界了..."}")

    println("------集合转数组-------")
//    3.List集合转  数组
    val charArray = listOf('A', 'B', 'C', 'D').toCharArray()
    println(charArray)

    //  4.arrayOf    Array<File>
    val arrayOf /*: Array<File> */= arrayOf(File("AAA"), File("BBB"), File("CCC"))
    println(arrayOf)
}