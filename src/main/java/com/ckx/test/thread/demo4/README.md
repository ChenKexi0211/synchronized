执行结果：
a begin time=2019-09-10 10:36:24
b begin time=2019-09-10 10:36:24
b   end time=2019-09-10 10:36:24
a   end time=2019-09-10 10:36:27

结论：
上面methodA持有lock对象锁，methodB持有ObjectService对象锁，不是同一个，所以使用synchronized(任意自定义对象)进行同步操作，
对象监视器必须是同一个对象。如果不是同一个，运行就是异步执行了。