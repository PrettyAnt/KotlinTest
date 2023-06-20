package com.prettyant.s6

//假设这个代码是开源的,很庞大的JDK源码,或者复杂的开源库
class KtBase113(val _name: String, val _age: Int, val _sex: Char)

//增加扩展函数
fun KtBase113.show() {
    println("show函数,name:$_name ,age:$_age ,sex:$_sex")
}

//TODO 对String 扩展
fun String.addExtAction(number: Int) = this + "@".repeat(number)
fun String.showStr() = println(this)

fun KtBase113.getInfo() = "getInfo函数,name:$_name ,age:$_age ,sex:$_sex"
/*  增加扩展函数后的 背后代码
    public final class KtBase113Kt{
        public static final void show(KtBase113 $this$show){
            System.out.println("show函数,name:" + $this.$show._name+ ",age:" + $this.$show._age + ",sex:" + $this.$show._sex)
        }
        public static final String getInfo(KtBase113 $this$getInfo){
            return "getInfo函数,name:" + $this.$getInfo._name+ ",age:" + $this.$getInfo._age + ",sex:" + $this.$getInfo._sex
        }

         public static final String addExtAction(@NotNull String $this$addExtAction, int number) {
            Intrinsics.checkNotNullParameter($this$addExtAction, "$this$addExtAction");
            return $this$addExtAction + StringsKt.repeat((CharSequence)"@", number);
         }

         public static final void showStr(@NotNull String $this$showStr) {
            Intrinsics.checkNotNullParameter($this$showStr, "$this$showStr");
            System.out.println($this$showStr);
         }

        public static void main(String[] args){
            main();
        }
        public static void main(){
            // ..
        }
    }

 */


//KtBase113.xxx   xxx函数里面会持有this == KtBase113对象本身
//TODO Kotlin语言的定义扩展函数学习
fun main() {
    val p = KtBase113("孙悟空", 999, 'M')
    p.show()
    println(p.getInfo())
    println()
    println("prettyant".addExtAction(8))
    "PrettyAnt".showStr()
}