执行结果：
synchronized thread name:Thread-0-->i=1 time=2019-09-10 10:35:42
synchronized thread name:Thread-0-->i=2 time=2019-09-10 10:35:43
run----objectMethodA time=2019-09-10 10:35:44
synchronized thread name:Thread-0-->i=3 time=2019-09-10 10:35:44
synchronized thread name:Thread-0-->i=4 time=2019-09-10 10:35:45
synchronized thread name:Thread-0-->i=5 time=2019-09-10 10:35:46
synchronized thread name:Thread-0-->i=6 time=2019-09-10 10:35:47
synchronized thread name:Thread-0-->i=7 time=2019-09-10 10:35:48
synchronized thread name:Thread-0-->i=8 time=2019-09-10 10:35:49
synchronized thread name:Thread-0-->i=9 time=2019-09-10 10:35:50
synchronized thread name:Thread-0-->i=10 time=2019-09-10 10:35:51
结论：
可以看到没有同步锁的objectMethodA方法异步执行了，下面我们将objectMethodA()加上同步。