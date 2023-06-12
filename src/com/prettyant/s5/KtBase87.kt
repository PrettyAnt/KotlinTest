package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 9:23 AM  12/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
//在KT中，所有的类，都隐式继承了Any
//Any在KT设计中：只是提供标准，看不到实现，实现在各个平台处理即可
object KtBase87{
    /*  object 对象类背后做了什么事情
        public static final KtBase87 INSTANCE;
        private KtBase87(){}  //主构造废除一样的效果
        public final void show(){
            String val ="show 函数..."
            ...
            System.out.println(val)
        }
        //这个区域是object不同点
        static{
             KtBase87 var0 = new KtBase87();
            INSTANCE = var0;
            String var0="KtBase87 init ..."
            System.out.println(var0)
        }

     */
    init {
        println("KtBase87 init ...")
    }
    fun show()= println("show 函数...")
}
// TODO Kotlin语言的对象声明学习
fun main() {
    //object KtBase87既是单例的实例，也是类名
    //小结:既然是单例的实例，又是类名，只有一个创建，这就是典型的单例
    //背后输出  System.out.println(KtBase87.INSTANCE)
    println(KtBase87)//com.prettyant.s5.KtBase87@7f31245a
    println(KtBase87)//com.prettyant.s5.KtBase87@7f31245a
    println(KtBase87)//com.prettyant.s5.KtBase87@7f31245a
    println("-------------")
    //背后代码 KtBase87.INSTANCE.show()
    println(KtBase87.show())
}