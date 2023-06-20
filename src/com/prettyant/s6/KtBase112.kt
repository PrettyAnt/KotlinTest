package com.prettyant.s6

//1.定义3个Obj类
data class ObjectClass1(val _name: String, val _age: Int, val _study: String)
data class ObjectClass2(val _name: String, val _age: Int, val _study: String)
data class ObjectClass3(val _name: String, val _age: Int, val _study: String)

class KtBase112{
    //所有的功能,写在函数上
    //需求: 默认随机输出一个对象,如果此对象和用户指定的对象不一致,我们就启用备用对象,否则就直接返回对象
    inline fun <reified T> randomOrDefault(defaultLambdaAction: () -> T): T? {
        val objList: List<Any> = listOf(
            ObjectClass1("obj1 孙悟空", 999, "72变"),
            ObjectClass2("obj2 猪八戒", 888, "36变"),
            ObjectClass3("obj3 唐僧", 1088, "紧箍咒")
        )
        val randomObj: Any? = objList.shuffled().first()
        println("您随机产生的对象是 $randomObj")
//        return randomObj.takeIf { it is T } as T ?: null
        //如果  it随机产生的对象  等于 T 类型的,就会走 as T 直接返回了
        //as T?返回的可能是 Obj1 Obj2 Obj3,不加❓则指定了返回类型.所以不加问号需要Any接收
        return randomObj.takeIf { it is T } as T?//todo  null as T     null as T?
            //如果  it随机产生的对象  不等于  T类型的,就会走下面这个备用环节
            ?: defaultLambdaAction()

    }
}
//TODO Kotlin语言的reified关键字学习
// 1.定义3个Obj类
// 2.randomOrDefault函数  备用机制的lambda
// 3.lists.shuffled()
fun main() {
    val result = KtBase112().randomOrDefault<ObjectClass1> {
        println("由于随机产生的对象和我们指定的ObjectClass1不一致,所以启用备用对象")
        ObjectClass1("备用对象 孙行者", 728, "精斗云")
    }
    println("最终的输出结果为:$result")
}