package com.prettyant.s7;

public class KtBase132 {
    public static void main(String[] args) {
        Person person = new Person();
//        for (String name : person.getNames()) {
//            System.out.println(name);
//        }
        for (String name : person.names) {
            System.out.println(name);
        }
    }
}
