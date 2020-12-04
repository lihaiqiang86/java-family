package com.lee.log.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Student extends Person {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    @Override
    public void speak(String message) {
        logger.trace("Student speak: {}", message);
        logger.debug("Student speak: {}", message);
        logger.info("Student speak: {}", message);
        logger.warn("Student speak: {}", message);
        logger.error("Student speak: {}", message);
    }
}
