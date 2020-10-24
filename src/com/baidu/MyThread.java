package com.baidu;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Administrator
 */
public class MyThread extends Thread {

    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (ticket > 0) {
                System.out.println(currentThread().getName()+" ticket = " + ticket--);
            }
        }
    }

}

class Test{
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        new Thread(t1).start();
        new Thread(t1).start();
        new Thread(t1).start();
    }
}