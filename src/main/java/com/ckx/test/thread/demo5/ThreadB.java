package com.ckx.test.thread.demo5;

public class ThreadB extends Thread {  

@Override
public void run() {
        ObjectService.methodB();
    }  

}  