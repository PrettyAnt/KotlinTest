package com.prettyant.s6

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:01 PM  13/06/23
 * PackageName : com.prettyant.s6
 * describle :
 */
interface IUSB2 {
    //todo 1.接口 var 也是不能给接口的成员赋值的 (但是有其他办法)
    // 2.任何接口等等 ,val代表只读的, 不可以可以在后面动态赋值 (也有其他办法)
    //  方式:成员声明为val ,通过get()方法设置值.  当以此方式实现时,子类可以不用再重写该成员

    val usbVersion: String
        //usb版本相关的信息
        get() = (1..100).shuffled().last().toString()
    //val 是只读的,不需要set

    val usbInsertDevices: String
        //usb插入的设备信息¬
        get() = "高级设备接入USB"

    fun insertUSB(): String
}

//鼠标USB实现类
class Mouse1: IUSB2 {
    override val usbInsertDevices: String
        get() = super.usbInsertDevices
    override val usbVersion: String
        get() = super.usbVersion
    override fun insertUSB() = "Mouse: $usbVersion,$usbInsertDevices"
}


//TODO Kotlin语言的接口的默认实现
//1.注意: 这样做是不对的,因为接口成员本来就是来声明标准的
//        但是可以在接口成员声明时,完成对接口成员的实现
fun main() {
    val usb1 = Mouse1()
    println(usb1.insertUSB())
    println("  ----------------- \n")

}
