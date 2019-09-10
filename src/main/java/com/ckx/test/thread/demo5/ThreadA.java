package com.ckx.test.thread.demo5;

public class ThreadA extends Thread {  

@Override
public void run() {
        ObjectService.methodA();
    }  

}  