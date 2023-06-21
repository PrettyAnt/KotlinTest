package com.prettyant.s6

val myStr:String = "AA"
/*  背后代码:
    public final class KtBase117Kt{
        @NotNull
        private static final String myStr = "AAA"

        @NotNull
        public static final String getMyStr(){
            return myStr;
        }
    }

 */

val String.myInfo:String
    get() = "AA"
/*  背后代码:
    public final class KtBase117Kt{
        private static final String myInfo = "Derry"
        @NotNull
        public static final String getMyInfo(@NotNull String $this$myInfo) {
           Intrinsics.checkNotNullParameter($this$myInfo, "$this$myInfo");
           return "AA";
        }
    }

 */

//todo 打印输出 并且链式调用(只有String有资格这样)
fun String.showPrinln():String{
    println("打印输出 并且链式调用(只有String有资格这样): $this")
    return this
}
val String.stringAllInfoValueVal
    get() = "当前${System.currentTimeMillis()}这个时间点被调用了一次,当前的值是:$this ,当前的字符串长度为:${this.length}"
//TODO Kotlin语言的扩展属性
fun main() {

    val str: String = "prettyant"
    println(str.myInfo)
    str.showPrinln().showPrinln()
    println()
    str.myInfo.showPrinln().showPrinln()
    println()
    "孙悟空".stringAllInfoValueVal//扩展属性
        .showPrinln().showPrinln()//扩展函数
}
class KtBase117 {
}