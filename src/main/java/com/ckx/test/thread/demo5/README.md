执行结果：
static methodB begin 线程名称:B times:1568019599830
static methodB end   线程名称:B times:1568019599830
static methodA begin 线程名称:A times:1568019599830

结论：
synchronized应用在static方法上，那是对当前对应的*.Class进行持锁。