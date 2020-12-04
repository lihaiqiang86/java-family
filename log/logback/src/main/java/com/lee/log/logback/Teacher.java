package com.lee.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Teacher extends Person {

    private static final Logger logger = LoggerFactory.getLogger(Teacher.class);

    @Override
    public void speak(String message) {
        logger.trace("Teacher speak: {}", message);
        logger.debug("Teacher speak: {}", message);
        logger.info("Teacher speak: {}", message);
        logger.warn("Teacher speak: {}", message);
        logger.error("Teacher speak: {}", message);
    }
}
