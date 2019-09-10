package com.ckx.test.thread.demo6;

import java.text.SimpleDateFormat;

public class ObjectService {

    private  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void methodA() {
        try {
            synchronized (ObjectService.class) {
                System.out.println("methodA begin 线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));
                Thread.sleep(3000);
                System.out.println("methodA end   线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        synchronized (ObjectService.class) {
            System.out.println("methodB begin 线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));
            System.out.println("methodB end   线程名称:" + Thread.currentThread().getName() + " time=" + dateFormat.format(System.currentTimeMillis()));
        }
    }

}  