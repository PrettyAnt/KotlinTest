package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:26 PM  13/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
abstract class BaseActivity {
    fun onCreate() {
        setContentView(getLayoutId())
        initView()
        initData()
        initXXX()
    }

    /*
          private final void setContentView(int layoutId) {
            String var2 = "加载" + layoutId + " 布局xml中";
            System.out.println(var2);
          }

         todo private fun setContentView(layoutId: Int)=println("加载$layoutId 布局xml中") //和下面的等价
     */
    private fun setContentView(layoutId: Int) {
        println("加载$layoutId 布局xml中")
    }


    abstract fun getLayoutId(): Int
    abstract fun initView()
    abstract fun initData()
    abstract fun initXXX()
}

class MainActivity : BaseActivity() {
    override fun getLayoutId(): Int = 888

    override fun initView() = println("view 初始化完成 ...")

    override fun initData() = println("data 初始化完成...")

    override fun initXXX() = println("xxx 初始化完成...")
    fun show() {
        super.onCreate()
    }
}

//TODO  Kotlin语言的抽象类的学习
fun main() {
    MainActivity().show()
}