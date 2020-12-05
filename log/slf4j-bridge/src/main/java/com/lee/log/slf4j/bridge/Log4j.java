package com.lee.log.slf4j.bridge;

import org.apache.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/5
 */
public class Log4j {

    private static final Logger logger = Logger.getLogger(Log4j.class);

    public void speak(String message) {
        logger.trace("trace: Log4j speak: " + message);
        logger.debug("debug: Log4j speak: " + message);
        logger.info("info: Log4j speak: " + message);
        logger.warn("warn: Log4j speak: " + message);
        logger.error("error: Log4j speak: " + message);
        logger.fatal("fatal: Log4j speak: " + message);
    }
}
