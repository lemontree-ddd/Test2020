package com.baidu;

/**
 * @Author Administrator
 */
public class Person {

    public Person(String s) {
        System.out.println("人");
    }
    public void print() {
        System.out.println("人1");
    }

    public static void main(String[] args) {
        Person p = new Teacher();
        p.print();

    }
}

class Teacher extends Person{
    public Teacher() {
        super("123");
        System.out.println("老师");
    }

    public void print() {
        System.out.println("老师1");
    }
}