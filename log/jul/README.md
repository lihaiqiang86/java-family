# Java原生JUL日志的基本使用介绍
![](https://cdn.nlark.com/yuque/0/2020/png/2397610/1606469476945-6473abed-d00a-44a7-9572-2f4484599313.png#align=left&display=inline&height=32&margin=%5Bobject%20Object%5D&originHeight=64&originWidth=72&size=0&status=done&style=none&width=36)
[CodeWhite7](https://blog.csdn.net/weixin_46146269) 2020-08-14 19:51:48 ![](https://cdn.nlark.com/yuque/0/2020/png/2397610/1606469476761-6198f6eb-f0f7-4d11-af69-cda5bf234fb2.png#align=left&display=inline&height=24&margin=%5Bobject%20Object%5D&originHeight=48&originWidth=48&size=0&status=done&style=none&width=24) 133 ![](https://cdn.nlark.com/yuque/0/2020/png/2397610/1606469476738-1df36290-d8f7-46f8-90b0-de3dcc47546a.png#align=left&display=inline&height=20&margin=%5Bobject%20Object%5D&originHeight=48&originWidth=48&size=0&status=done&style=none&width=20)
分类专栏： [开发工具](https://blog.csdn.net/weixin_46146269/category_9970205.html) [笔记](https://blog.csdn.net/weixin_46146269/category_10065958.html) 文章标签： [java](https://www.csdn.net/gather_24/NtTaIg5sMzYyLWJsb2cO0O0O.html) [logging](https://www.csdn.net/gather_28/MtTaEg0sMjMzMzktYmxvZwO0O0OO0O0O.html) [log4j](https://www.csdn.net/gather_25/MtTaEg0sMjMzNTItYmxvZwO0O0OO0O0O.html) [大数据](https://www.csdn.net/gather_2f/MtTaYg5sNzg2NS1ibG9n.html) [linux](https://www.csdn.net/gather_2d/MtjaQg5sMDY0MC1ibG9n.html)
[版权]()
> **写在前边：** 日志是我们开发不能少的工具，它可以记录很多运行和调试的信息，让我们后期更好的维护项目。
> **公众号：小白编码**

### 目录

- [JAVA日志框架](https://blog.csdn.net/weixin_46146269/article/details/108012491#JAVA_4)
    - [日志门面](https://blog.csdn.net/weixin_46146269/article/details/108012491#_10)
    - [日志实现](https://blog.csdn.net/weixin_46146269/article/details/108012491#_14)
    - [使用：](https://blog.csdn.net/weixin_46146269/article/details/108012491#_26)
    - [运行结果：](https://blog.csdn.net/weixin_46146269/article/details/108012491#_46)
    - [日志的级别](https://blog.csdn.net/weixin_46146269/article/details/108012491#_58)
    - [自定义级别：](https://blog.csdn.net/weixin_46146269/article/details/108012491#_74)
    - [Logger的父子关系](https://blog.csdn.net/weixin_46146269/article/details/108012491#Logger_118)
    - [日志的配置文件](https://blog.csdn.net/weixin_46146269/article/details/108012491#_132)
    - [日志原理解析](https://blog.csdn.net/weixin_46146269/article/details/108012491#_194)
## JAVA日志框架

1. 控制日志输出的内容和格式
1. 控制日志输出的位置
1. 日志优化：异步日志，日志文件的归档和压缩
1. 日志系统的维护
1. 面向接口开发 – 日志的门面
#### 日志门面
`JCL、slf4j`
#### 日志实现
`JUL、logback、log4j、log4j2`

![](https://cdn.nlark.com/yuque/0/2020/png/2397610/1606469476819-c9c36b03-f4cf-47c5-b4ab-c855bbb70cc0.png#align=left&display=inline&height=370&margin=%5Bobject%20Object%5D&originHeight=370&originWidth=1358&size=0&status=done&style=none&width=1358)

- `Loggers`：被称为记录器，应用程序通过获取Logger对象，调用其API来来发布日志信息。Logger通常时应用程序访问日志系统的入口程序。
- `Appenders`：也被称为Handlers，每个Logger都会关联一组Handlers，Logger会将日志交给关联Handlers处理，由Handlers负责将日志做记录。Handlers在此是一个抽象，其具体的实现决定了日志记录的位置可以是控制台、文件、网络上的其他日志服务或操作系统日志等。
-`Layouts`：也被称为Formatters，它负责对日志事件中的数据进行转换和格式化。Layouts决定了数据在一条日志记录中的最终形式。
- `Level`：每条日志消息都有一个关联的日志级别。该级别粗略指导了日志消息的重要性和紧迫，我可以将Level和Loggers，Appenders做关联以便于我们过滤消息。
- `Filters`：过滤器，根据需要定制哪些信息会被记录，哪些信息会被放过。
#### 使用：
```java
@Test
    public void test() {
        //1.获取日志记录器对象
        Logger logger = Logger.getLogger("cn.codewhite.log.JULTest");
        //2.日志记录输出
        logger.info("hello jul");
        // 通用方法进行日志记录。
        logger.log(Level.INFO, "info level");
        //通过占位符 方式输出变量值
        String name = "codewhite";
        Integer age = 18;
        logger.log(Level.INFO,"用户信息：{0},{1}",new Object[]{name,age});
    }
```
#### 运行结果：
```
com.intellij.rt.junit.JUnitStarter -ideVersion5 -junit4 cn.codewhite.log.JULTest,test
八月 14, 2020 12:37:59 下午 cn.codewhite.log.JULTest test
信息: hello jul
八月 14, 2020 12:37:59 下午 cn.codewhite.log.JULTest test
信息: info level
八月 14, 2020 12:37:59 下午 cn.codewhite.log.JULTest test
信息: 用户信息：codewhite,18
```
#### 日志的级别
```
java.util.logging.Level中定义了日志的级别：
    SEVERE（最高值）
    WARNING
    INFO （默认级别）
    CONFIG
    FINE
    FINER
    FINEST（最低值）
 还有两个特殊的级别：
    OFF，可用来关闭日志记录。
    ALL，启用所有消息的日志记录。
```
#### 自定义级别：
```java
@Test
public void testLogConfig() throws IOException {
    // 1.创建日志记录器对象
    Logger logger = Logger.getLogger("cn.codewhite.log.JULTest");
    // 一、自定义日志级别
    // a.关闭系统默认配置
    logger.setUseParentHandlers(false);
    // b.创建handler对象
    ConsoleHandler handler = new ConsoleHandler();
    // c.创建formatter对象
    SimpleFormatter simpleFormatter = new SimpleFormatter();
    // d.进行关联
    handler.setFormatter(simpleFormatter);
    logger.addHandler(handler);
    // e.设置日志级别
    logger.setLevel(Level.ALL);
    handler.setLevel(Level.ALL);
    // 二、输出到日志文件（前提要存在此文件）
    FileHandler fileHandler = new FileHandler("F:\\workspace_idea4\\logtest\\logs\\jul.log");
    // 进行关联
    fileHandler.setFormatter(simpleFormatter);
    logger.addHandler(fileHandler);
    // 2.日志记录输出
    logger.severe("severe");
    logger.warning("warning");
    logger.info("info");
    logger.config("config");
    logger.fine("fine");
    logger.finer("finer");
    logger.finest("finest");
}
```
#### Logger的父子关系
JUL中Logger之间存在父子关系，这种父子关系通过树状结构存储，JUL在初始化时会创建一个顶层
RootLogger作为所有Logger父Logger，存储上作为树状结构的根节点。并父子关系通过路径来关联。
所有日志记录器对象的顶级父元素 class为java.util.logging.LogManager$RootLogger
name为""
```java
Logger logger1 = Logger.getLogger("com.codewhite.log");//子
Logger logger2 = Logger.getLogger("com.codewhite");//父
```
#### 日志的配置文件
默认配置文件路径`$JAVAHOME\jre\lib\logging.properties`
```java
@Test
public void testProperties() throws Exception {
    // 读取自定义配置文件
    InputStream in =
            JULTest.class.getClassLoader().getResourceAsStream("logging.properties");
    // 获取日志管理器对象
    LogManager logManager = LogManager.getLogManager();
    // 通过日志管理器加载配置文件
    logManager.readConfiguration(in);
    Logger logger = Logger.getLogger("com.itheima.log.JULTest");
    logger.severe("severe");
    logger.warning("warning");
    logger.info("info");
    logger.config("config");
    logger.fine("fine");
    logger.finer("finer");
    logger.finest("finest");
}
```
配置文件：
```
##RootLogger使用的处理器（获取时设置）：顶级父元素
handlers=java.util.logging.ConsoleHandler
#RootLogger日志等级
.level=INFO
##自定义Logger
com.itheima.handlers=java.util.logging.FileHandler
#自定义Logger日志等级
com.itheima.level=INFO
#忽略父日志设置
com.itheima.useParentHandlers=false
##控制台处理器
#输出日志级别
java.util.logging.ConsoleHandler.level=INFO
#指定handler对象的字符集
java.util.logging.ConsoleHandler.encoding=UTF-8
#输出日志格式
java.util.logging.ConsoleHandler.formatter=java.util.logging.SimpleFormatter
##文件处理器
#输出日志级别
java.util.logging.FileHandler.level=INFO
#输出日志格式
java.util.logging.FileHandler.formatter=java.util.logging.SimpleFormatter
#输出日志文件路径
java.util.logging.FileHandler.pattern=/java%u.log
#输出日志文件限制大小（50000字节）
java.util.logging.FileHandler.limit=50000
#输出日志文件限制个数
java.util.logging.FileHandler.count=10
#输出日志文件 是否是追加（不会覆盖前边的日志）
java.util.logging.FileHandler.append=true
# 指定日志消息格式
java.util.logging.SimpleFormatter.format = %4$s: %5$s [%1$tc]%n
```
#### 日志原理解析

1. 初始化LogManager
   - LogManager加载logging.properties配置

   - 添加Logger到LogManager

2. 从单例LogManager获取Logger

2. 设置级别Level，并指定日志记录LogRecord

2. Filter提供了日志级别之外更细粒度的控制

2. Handler是用来处理日志输出位置

2. Formatter是用来格式化LogRecord的


![](https://cdn.nlark.com/yuque/0/2020/png/2397610/1606469476835-7816a96a-244e-4ff6-83ea-15565740a4a7.png#align=left&display=inline&height=157&margin=%5Bobject%20Object%5D&originHeight=157&originWidth=1004&size=0&status=done&style=none&width=1004)
