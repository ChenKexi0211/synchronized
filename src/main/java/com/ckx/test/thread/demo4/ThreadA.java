package com.ckx.test.thread.demo4;

public class ThreadA extends Thread {

    private ObjectService objectService;

    public ThreadA(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.methodA();
    }
}