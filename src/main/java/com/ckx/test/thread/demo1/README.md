执行结果：
A begin time=1568017093195
A end   time=1568017095197
B begin time=1568017095197
B end   time=1568017095197
结论：
当一个线程访问ObjectService的一个synchronized (this)同步代码块时，
其它线程对同一个ObjectService中其它的synchronized (this)同步代码块的访问将是堵塞，
说明synchronized (this)使用的是同一个对象锁。