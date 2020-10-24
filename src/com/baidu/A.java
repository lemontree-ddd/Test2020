package com.baidu;

/**
 * @Author Administrator
 */
public class A {
    {                   //成员方法      3
        System.out.println("hello A");
    }

    public A() {   //构造方法A     5
        System.out.println("TestA constructor!");
    }

    static {     //静态代码块         1
        System.out.println("TestA static");
    }
}
