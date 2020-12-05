package com.lee.log.slf4j.jul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Student extends Person {

    private static final Logger logger = LoggerFactory.getLogger(Student.class);

    @Override
    public void speak() {
        logger.trace("trace: Student speak");
        logger.debug("debug: Student speak");
        logger.info("info: Student speak");
        logger.warn("warn: Student speak");
        logger.error("error: Student speak");
    }
}
