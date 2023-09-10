package com.example.springmvc.javaApi;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    @Test
    void thread() throws InterruptedException {

        Thread thread = new Thread(() -> {
            System.out.println("this is test thrad");
            for (StackTraceElement el : Thread.currentThread().getStackTrace()) {
                System.out.println(el);
            }
            ;
            System.out.println("stack trace");
        });
        System.out.println("after 선언");

//        thread.start();
        //thread.start(); // start 와 run의 차이?
//        System.out.println("thread run");
        thread.run();
//        for (StackTraceElement el : Thread.currentThread().getStackTrace()) {
//            System.out.println("test main stack");
//            System.out.println(el);
//        }
//        Thread.sleep(1000);
    }
}
