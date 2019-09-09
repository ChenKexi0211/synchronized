执行结果：
synchronized thread name:Thread-0-->i=1
synchronized thread name:Thread-0-->i=2
synchronized thread name:Thread-0-->i=3
run----objectMethodA
synchronized thread name:Thread-0-->i=4
synchronized thread name:Thread-0-->i=5
synchronized thread name:Thread-0-->i=6
synchronized thread name:Thread-0-->i=7
synchronized thread name:Thread-0-->i=8
synchronized thread name:Thread-0-->i=9
synchronized thread name:Thread-0-->i=10
结论：
可以看到没有同步锁的objectMethodA方法异步执行了，下面我们将objectMethodA()加上同步。