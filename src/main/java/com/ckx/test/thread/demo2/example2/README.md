执行结果：
synchronized thread name:Thread-0-->i=1 time=2019-09-10 10:34:54
synchronized thread name:Thread-0-->i=2 time=2019-09-10 10:34:55
synchronized thread name:Thread-0-->i=3 time=2019-09-10 10:34:56
synchronized thread name:Thread-0-->i=4 time=2019-09-10 10:34:57
synchronized thread name:Thread-0-->i=5 time=2019-09-10 10:34:58
synchronized thread name:Thread-0-->i=6 time=2019-09-10 10:34:59
synchronized thread name:Thread-0-->i=7 time=2019-09-10 10:35:00
synchronized thread name:Thread-0-->i=8 time=2019-09-10 10:35:01
synchronized thread name:Thread-0-->i=9 time=2019-09-10 10:35:02
synchronized thread name:Thread-0-->i=10 time=2019-09-10 10:35:03
run----objectMethodA time=2019-09-10 10:35:04
结论：
多个线程调用同一个对象中的不同名称的synchronized同步方法或synchronized(this)同步代码块时，是同步的。
1、synchronized同步方法
①对其它的synchronized同步方法或synchronized(this)同步代码块调用是堵塞状态；
②同一时间只有一个线程执行synchronized同步方法中的代码。
2、synchronized(this)同步代码块
①对其它的synchronized同步方法或synchronized(this)同步代码块调用是堵塞状态；
②同一时间只有一个线程执行synchronized同步方法中的代码。