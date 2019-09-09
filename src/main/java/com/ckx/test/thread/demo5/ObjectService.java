package com.ckx.test.thread.demo5;

import java.text.SimpleDateFormat;

public class ObjectService {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public synchronized static void methodA() {
        try {
            System.out.println("static methodA begin 线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));
            Thread.sleep(3000);
            System.out.println("static methodA end   线程名称:" + Thread.currentThread().getName() + "  time=" + dateFormat.format(System.currentTimeMillis()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized static void methodB() {
        System.out.println("static methodB begin 线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));
        System.out.println("static methodB end   线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));

    }

}  