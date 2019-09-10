执行结果：
static methodB begin 线程名称:B time=2019-09-10 10:37:26
static methodB end   线程名称:B time=2019-09-10 10:37:26
static methodA begin 线程名称:A time=2019-09-10 10:37:26
static methodA end   线程名称:A  time=2019-09-10 10:37:29

结论：
synchronized应用在static方法上，那是对当前对应的*.Class进行持锁。