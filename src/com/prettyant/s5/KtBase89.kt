package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 4:38 PM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
class KtBase89 {
    //伴生对象
    companion object {
        val info = "prettyant"
        fun showInfo() = println("显示$info")
    }
    /*  companion object {} 背后逻辑
        private static final String info = "prettyant";
        final KtBase89.Companion companion =new KtBase89.Companion(xxx);

        public static final class Companion {

            public final String getInfo() {
                return KtBase89.info;
            }

            public final void showInfo() {
                String var1 = "显示" + ((Companion)this).getInfo();
                System.out.println(var1);
             }
            private Companion() {
             }

            public Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }
   }
     */
}

// TODO Kotlin语言的伴生对象学习
//伴生对象的由来：在Kotlin中是没有java这种static静态，伴生很大程度上和Java的这种statci 静态差不多的
//无论 KtBase89() 构建对象多少次 ，伴生对象只有一次加载
//无论KtBase89.showInfo() 调用多少次，我们的伴生对象，只有一次加载
// 伴生对象只会初始化一次
fun main() {
    // 背后代码: System.out.println(KtBase89.Companion.getInfo());
    println(KtBase89.info)

    //背后代码: System.out.println(KtBase89.Companion.showInfo());
    KtBase89.showInfo()

    //new KtBase89()
    KtBase89()
    KtBase89()
    KtBase89()
    //...
}