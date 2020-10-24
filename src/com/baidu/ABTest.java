package com.baidu;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author Administrator
 */
public class ABTest {

    public static void main(String[] args) {
/*
        // Integer转成String
        Integer in = new Integer(10);
        String s = String.valueOf(in);
        System.out.println(s);
        Map map = new HashMap<>();
        Map map1 = new TreeMap<>();*/

        // s2 会创建两个对象 一个是堆中，一个在常量池中
        String s2 = new String("dfwfwr");
        // 在jdk7 8中，
        // intern方法如果常量池中没有，则将堆中的引用地址复制一份放入字符串常量池
        // 常量池中有，就直接返回常量池已有的内存地址。
        String s4 = s2.intern();
        System.out.println(s4 == s2);


    }

}
