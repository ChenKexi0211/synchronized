package com.ckx.test.thread.demo2.example1;

import java.text.SimpleDateFormat;

public class ObjectService {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void objectMethodA() {
        System.out.println("run----objectMethodA time=" + dateFormat.format(System.currentTimeMillis()));
    }

    public void objectMethodB() {
        synchronized (this) {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("synchronized thread name:" + Thread.currentThread().getName() + "-->i=" + i
                            + " time=" + dateFormat.format(System.currentTimeMillis()));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}  