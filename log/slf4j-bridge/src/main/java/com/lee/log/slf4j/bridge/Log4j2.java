package com.lee.log.slf4j.bridge;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/5
 */
public class Log4j2 {

    private static final Logger logger = LogManager.getLogger(Log4j2.class);

    public void speak(String message) {
        logger.trace("trace: Log4j2 speak: " + message);
        logger.debug("debug: Log4j2 speak: " + message);
        logger.info("info: Log4j2 speak: " + message);
        logger.warn("warn: Log4j2 speak: " + message);
        logger.error("error: Log4j2 speak: " + message);
        logger.fatal("fatal: Log4j2 speak: " + message);
    }
}
