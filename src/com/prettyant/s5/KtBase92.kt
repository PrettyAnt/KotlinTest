package com.prettyant.s5

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 12:16 AM  13/06/23
 * PackageName : com.prettyant.s5
 * describle :
 */
data class KtBase92(var name: String, var age: Int) {
    //主构造
    var coreInfo: String = ""

    init {
        println("主构造被调用了")
    }

    //次构造
    constructor(name: String) : this(name, 99) {
        println("次构造被调用")
        coreInfo = "增加非常核心的内容信息"
    }

    override fun toString(): String {
        return "toString name:$name,age:$age,coreInfo:$coreInfo"
    }
}

/*  生成的toString 为什么只有两个参数?
    默认生成的toString 或者hasCode equals 等等  只管主构造,不管次构造
    public String toString() {
      return "KtBase92(name=" + this.name + ", age=" + this.age + ")";
   }
 */
//TODO Kotlin 语言的copy函数学习
fun main() {
    val p1 = KtBase92("孙悟空")//调用次构造初始化对象
    println(p1)
    val p2 = p1.copy("猪八戒", 888)
    println(p2)
    // copy toString hasCode equals 等等... 主管主构造,不管次构造
    //注意事项: 使用copy的时候,由于内部代码只处理主构造,所以必须考虑次构造的内容
}