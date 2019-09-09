执行结果：
static methodA begin 线程名称:A times:1568019666734
static methodA end   线程名称:A times:1568019669735
static methodB begin 线程名称:B times:1568019669735
static methodB end   线程名称:B times:1568019669735

结论：
同步synchronized(*.class)代码块的作用其实和synchronized static方法作用一样。Class锁对类的所有对象实例起作用。