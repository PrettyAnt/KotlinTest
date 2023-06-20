package com.prettyant.s6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 5:59 PM  19/06/23
 * PackageName : com.prettyant.s3
 * describle :
 */
public class KtBase110 {
    public static void main(String[] args) {
        List<CharSequence> list = new ArrayList<CharSequence>();

        //泛型默认情况下是: 泛型的父类对象  不可以赋值给泛型的子类对象
//        List<CharSequence> list2 = new ArrayList<String>();  //fixme 报错

        //泛型默认情况下是: 泛型具体处的子类对象  不可以赋值给 泛型声明处的对象

        //CharSequence父类      String子类

        //加上 in 没有报错,相当于  ? super String

        List<? super String> list2 = new ArrayList<CharSequence>();

        //逆变: 子类 泛型声明处  可以接收  父类  泛型具体处

    }
}
