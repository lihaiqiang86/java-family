package com.lee.log.jul;

import java.io.InputStream;
import java.util.logging.*;

/**
 * @author lihaiqiang
 * @since 2020/11/27
 */
public class Test {

    public static void main(String[] args) throws Exception {
        log1();
        log2();
        log3();
        log4();
    }

    private static void log1() {
        // 默认INFO级别
        Logger logger = Logger.getLogger(Test.class.getName());
        logger.severe("severe message");
        logger.warning("warning message");
        logger.info("info message");
        logger.config("config message");
        logger.fine("fine message");
        logger.finer("finer message");
        logger.finest("finest message");
    }

    private static void log2() {
        // 默认INFO级别
        Logger logger = Logger.getLogger(Test.class.getName());
        logger.log(Level.SEVERE, "SEVERE message");
        logger.log(Level.WARNING, "WARNING message");
        logger.log(Level.INFO, "INFO message");
        logger.log(Level.CONFIG, "CONFIG message");
    }

    private static void log3() throws Exception {
        // 1.创建日志记录器对象
        Logger logger = Logger.getLogger(Test.class.getName());

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
        FileHandler fileHandler = new FileHandler("D:\\logs\\jul.log");

        // 进行关联
        fileHandler.setFormatter(simpleFormatter);
        logger.addHandler(fileHandler);

        // 2.日志记录输出
        logger.severe("---------------------severe");
        logger.warning("---------------------warning");
        logger.info("---------------------info");
        logger.config("---------------------config");
        logger.fine("---------------------fine");
        logger.finer("---------------------finer");
        logger.finest("---------------------finest");
    }

    private static void log4() throws Exception {
        // 读取自定义配置文件
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("logging.properties");
        // 获取日志管理器对象
        LogManager logManager = LogManager.getLogManager();
        // 通过日志管理器加载配置文件
        logManager.readConfiguration(in);

        Logger logger = Logger.getLogger("JULTest");
        logger.addHandler(new FileHandler());
        logger.severe("severe========================");
        logger.warning("warning========================");
        logger.info("info========================");
        logger.config("config========================");
        logger.fine("fine========================");
        logger.finer("finer========================");
        logger.finest("finest========================");
    }
}
