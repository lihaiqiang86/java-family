package com.lee.log.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Student extends Person {

    private static final Logger logger = LogManager.getLogger(Person.class);

    @Override
    public void speak(String message) {
        logger.trace("Student speak: {}", message);
        logger.debug("Student speak: {}", message);
        logger.info("Student speak: {}", message);
        logger.warn("Student speak: {}", message);
        logger.error("Student speak: {}", message);
        logger.fatal("Student speak: {}", message);
    }
}
