package com.ckx.test.thread.demo5;

public class MainTest {

    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();

    }

}  