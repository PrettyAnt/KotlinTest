package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 4:12 PM  13/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
interface IUSB {
    var usbVersion: String//usb版本相关的信息
    var usbInsertDevices: String//usb插入的设备信息
    fun insertUSB(): String
}

//鼠标USB实现类
class Mouse(
    override var usbVersion: String = "USB 3.0",
    override var usbInsertDevices: String = "鼠标接入了USB口"
) : IUSB {
    override fun insertUSB() = "Mouse: $usbVersion,$usbInsertDevices"
}

//键盘USB实现类  todo 换一种方式来重写
class KeyBoard() : IUSB {
    override var usbVersion = "USB 3.1"
        //下面的set get 都会持有field ,现在是你没有给ustVersionInfo赋值,意味着field是没法让set/get持有的
        get() = field
        set(value) {//fixme 可以省略  下面也是
            field = value
        }
    override var usbInsertDevices: String = "初始化键盘"
        get() {
            println("get 获取的[$field]的值出去了")
            return field
        }
        set(value) {
            field = value
            println("set 赋值的[$value]的值进来了")
        }

    override fun insertUSB() = "KeyBoard: $usbVersion,$usbInsertDevices"
}

//TODO  Kotlin 语言的接口定义
// 1. 接口里面的所有成员和接口本身都是public open的,,所以不需要 open ,这个是接口的特殊
// 2. 接口不能有主构造,反正就是没有构造
// 3. 实现类不仅仅要重写接口的函数,也要重写接口的成员
// 4. 接口实现代码区域,全部要增加 override 关键字来修饰
fun main() {
    val usb1 = Mouse()
    println(usb1.insertUSB())
    println("  ----------------- \n")
    val usb2 = KeyBoard()
    usb2.usbVersion = "usb 5.0"
    usb2.usbInsertDevices = "设置键盘"
    println("\n" + usb2.insertUSB())
}