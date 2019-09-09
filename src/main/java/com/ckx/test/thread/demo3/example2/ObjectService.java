package com.ckx.test.thread.demo3.example2;

import java.text.SimpleDateFormat;

public class ObjectService {

    private String uname;

    private String pwd;

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void setUserNamePassWord(String userName, String passWord) {
        try {
            String lock = new String();
            synchronized (lock) {
                System.out.println("thread name=" + Thread.currentThread().getName()
                        + " time=" + dateFormat.format(System.currentTimeMillis()));
                uname = userName;
                Thread.sleep(3000);
                pwd = passWord;
                System.out.println("thread name=" + Thread.currentThread().getName()
                        + " time=" + dateFormat.format(System.currentTimeMillis()) + "入参uname:" + uname + "入参pwd:" + pwd);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}