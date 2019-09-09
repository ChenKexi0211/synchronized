package com.ckx.test.thread.demo1;

import java.text.SimpleDateFormat;

public class ObjectService {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void serviceMethodA() {
        try {
            synchronized (this) {
                System.out.println("A begin time=" + dateFormat.format(System.currentTimeMillis()));
                Thread.sleep(2000);
                System.out.println("A end   time=" +dateFormat.format(System.currentTimeMillis()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void serviceMethodB() {
        synchronized (this) {
            System.out.println("B begin time=" + dateFormat.format(System.currentTimeMillis()));
            System.out.println("B end   time=" +dateFormat.format(System.currentTimeMillis()));
        }
    }

}  