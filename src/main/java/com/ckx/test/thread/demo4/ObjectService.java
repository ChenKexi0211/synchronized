package com.ckx.test.thread.demo4;

import java.text.SimpleDateFormat;

public class ObjectService {

    private String lock = new String();

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void methodA() {
        try {
            synchronized (lock) {
                System.out.println("a begin"+" time=" + dateFormat.format(System.currentTimeMillis()));
                Thread.sleep(3000);
                System.out.println("a   end"+" time=" + dateFormat.format(System.currentTimeMillis()));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

    }

    public synchronized void methodB() {
        System.out.println("b begin"+" time=" + dateFormat.format(System.currentTimeMillis()));
        System.out.println("b   end"+" time=" + dateFormat.format(System.currentTimeMillis()));
    }

}