package com.ckx.test.thread.demo2.example1;

public class ThreadB extends Thread {

    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        super();
        this.objectService = objectService;

    }

    @Override

    public void run() {
        super.run();
        objectService.objectMethodB();

    }

}  