package com.prettyant.practice;

/**
 * @author chenyu
 * My personal blog  https://prettyant.github.io
 * Created on 10:21 AM  19/06/23
 * PackageName : com.prettyant.practice
 * describle :
 */
//TODO 模仿RxJava ,将类型 S 变换为 类型 T

public class RxJavaTest {
    public static void main(String[] args) {
        RxChange rxChange = new RxChange();
        //todo 将PersonBean 变换为 StudentBean
        StudentBean result = rxChange.changeData(true, new PersonBean("prettyant", 18), personBean -> new StudentBean(personBean.name, personBean.age));
        System.out.println("result:" + result);
        //todo 将Int类型变换为String类型
        System.out.println(rxChange.changeData(true, 680, (RxChange.Params<Integer, String>) integer -> "result: " + integer));
    }


}


class RxChange {
    public <S, T> T changeData(boolean change, S s, Params<S, T> params) {
        if (change) {
            return params.onParams(s);
        } else {
            return null;
        }
    }

    interface Params<S, T> {
        T onParams(S s);
    }
}


class PersonBean {
    String name;
    int age;

    public PersonBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class StudentBean {
    String name;
    int age;

    public StudentBean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
