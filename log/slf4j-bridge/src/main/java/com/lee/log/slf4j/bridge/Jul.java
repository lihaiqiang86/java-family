package com.lee.log.slf4j.bridge;


import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Jul {

    private static final Logger logger = Logger.getLogger(Jul.class.getName());

    static {
        // 读取自定义配置文件
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("logging.properties");
        // 获取日志管理器对象
        LogManager logManager = LogManager.getLogManager();
        // 通过日志管理器加载配置文件
        try {
            logManager.readConfiguration(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void speak(String message) {
        logger.finest("finest: Jul speak: " + message);
        logger.finer("finer: Jul speak: " + message);
        logger.fine("fine: Jul speak: " + message);
        logger.config("config: Jul speak: " + message);
        logger.info("info: Jul speak: " + message);
        logger.warning("warning: Jul speak: " + message);
        logger.severe("severe: Jul speak: " + message);
    }
}
