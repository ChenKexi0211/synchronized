package com.ckx.test.thread.demo3.example2;

import com.ckx.test.thread.demo3.example1.ObjectService;

public class ThreadB extends Thread {

    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        super();
        this.objectService = objectService;
    }

    @Override
    public void run() {
        objectService.setUserNamePassWord("b", "bb");

    }

}