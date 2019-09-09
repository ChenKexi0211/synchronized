执行结果：
thread name=A time=2019-09-09 17:06:08
thread name=A time=2019-09-09 17:06:11入参uname:a入参pwd:aa
thread name=B time=2019-09-09 17:06:11
thread name=B time=2019-09-09 17:06:14入参uname:b入参pwd:bb
结论：
多个线程持有对象监视器作为同一个对象的前提下，同一时间只有一个线程可以执行synchronized(任意自定义对象)同步代码块。
