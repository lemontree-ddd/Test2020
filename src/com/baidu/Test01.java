package com.baidu;

import org.junit.Test;

import javax.swing.*;
import java.util.Scanner;

class ListNode{
    int num;
    ListNode next;

    ListNode(int m) {
        num = m;
    }
}

public class Test01 {

    public static void main(String[] args) {
        int[] arry = {-2,1, -3 ,4, -1 ,2 ,1, -5 ,4};
        System.out.println(test08(arry));
    }
    public static int test08(int[] arr) {
        if (arr == null || arr.length < 1) {
            System.out.println("数组为null");
        }
        int max = Integer.MIN_VALUE;
        int tmpMax = 0;
        for (int i : arr) {
            if (tmpMax <= 0) {
                tmpMax = i;
            }else{
                tmpMax += i;
            }
            if (max < tmpMax) {
                max = tmpMax;
            }
        }
        return max;
    }

}


