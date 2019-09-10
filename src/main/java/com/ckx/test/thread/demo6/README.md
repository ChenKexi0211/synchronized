执行结果：
methodA begin 线程名称:A time=2019-09-10 10:39:14
methodA end   线程名称:A time=2019-09-10 10:39:17
methodB begin 线程名称:B time=2019-09-10 10:39:17
methodB end   线程名称:B time=2019-09-10 10:39:17

结论：
同步synchronized(*.class)代码块的作用其实和synchronized static方法作用一样。Class锁对类的所有对象实例起作用。