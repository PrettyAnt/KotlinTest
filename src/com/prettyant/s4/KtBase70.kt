package com.prettyant.s4

import java.util.*

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:47 AM  8/06/23
 * PackageName : com.prettyant.s4
 * describle :
 */
//TODO Kotlin语言的定义类与field关键字学习

class KtBase70 {
    var name: String = "PrettyAnt"
    /*
         背后做的事情:

         @NotNull
         private String name = "PrettyAnt"
        public void setName(@NotNull String name){
             this.name=name
        }
        @NotNull
        public String getName() {
             return this.name;
         }
   */

    var value = "ABCDEFG"
        //下面的隐式代码，不写也有，就是下面这个样子
        get() = field
        set(value) {
            field = value
        }

    var info = "handsome person"
        get() = field.capitalize()//把首字母改成大写
        set(value) {
            field = "**[$value]**"
        }
    /*
           背后做的事情:
           @NotNull
           private String info = "handsome person";
           @NotNull
           private String info = "PrettyAnt"
          public final void setInfo(@NotNull String value) {
                this.info = "**[" + value + "]**";
            }
          @NotNull
          public String getInfo() {
               StringsKt.capitalize(this.info);
           }
     */
}

//main被 class KtBase70Kt{    } 包裹
fun main() {
    //背后隐式代码  (new KtBase70()).setName("孙悟空");
    KtBase70().name = "孙悟空"

    //背后隐式代码  System.out.println((new KtBase70()).getName()
    println("getName结果--->>  ${KtBase70().name}")
    println("\n--------------")

    //隐式代码  System.out.println((new KtBase70()).getInfo()
    println("getInfo结果--->>  ${KtBase70().info}")
    println("\n--------------")


    //背后隐式代码: new KtBase70().setInfo("我是帅比")
    KtBase70().info = "我是帅比"
    println("getInfo结果2--->>  ${KtBase70().info}")

    println("\n--------------")
    val ktBase70 = KtBase70()
    ktBase70.info = "我是帅比"
    println("改变info, getInfo结果--->>  ${ktBase70.info}")

}