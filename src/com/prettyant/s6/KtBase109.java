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
public class KtBase109 {
    public static void main(String[] args) {
        List<CharSequence> list = new ArrayList<CharSequence>();

        //泛型默认情况下是: 泛型的子类对象  不可以赋值给泛型的父类对象
        //泛型默认情况下是: 泛型具体处的子类对象  不可以赋值给 泛型声明处的对象

        //CharSequence父类      String子类

//        List<CharSequence> list2 = new ArrayList<String>();  //fixme 报错
        //加上out没有报错,相当于  ? extends CharSequence

        List<? extends CharSequence> list2 = new ArrayList<String>();

        //协变: 父类 泛型声明处  可以接收  子类  泛型具体处

    }
}
