package com.ckx.test.thread.demo3.example2;

import com.ckx.test.thread.demo3.example1.ObjectService;
import com.ckx.test.thread.demo3.example1.ThreadA;
import com.ckx.test.thread.demo3.example1.ThreadB;

public class MainTest {

    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();

    }

}  