@file:JvmName("Stu")//在编译器环境修改类名
package com.prettyant.s7

//TODO Kotlin语言 注解@JvmName
fun getStudentNameValueInfo(str: String) = println(str)

fun main() {

}
/* 背后生成的代码
    public final class KtBase131Kt{
        public static final void getStudentNameValueInfo(@NotNull String str) {
            System.out.println(str);
        }

        public static final void main() {
        }

        public static void main(String[] var0) {
            main();
        }
    }
    ------------------------------------------------
    public final class Stu{
        public static final void getStudentNameValueInfo(@NotNull String str) {
            System.out.println(str);
        }

        public static final void main() {
        }

        public static void main(String[] var0) {
            main();
        }
    }

 */