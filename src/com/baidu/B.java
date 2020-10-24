package com.baidu;

/**
 * @Author Administrator
 */
public class B extends A {
    {

        System.out.println("hello B");
    }

    public B() {          //构造方法B       6
        System.out.println("TestB constructor!");
    }

    static {                        //静态代码块         2
        System.out.println("TestB static");
    }

/*    public static void main(String[] args) {
        System.out.println("main");
        new B();
    }*/

}