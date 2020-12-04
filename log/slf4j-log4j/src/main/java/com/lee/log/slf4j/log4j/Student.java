package com.lee.log.slf4j.log4j;

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
        logger.trace("Student speak");
        logger.debug("Student speak");
        logger.info("Student speak");
        logger.warn("Student speak");
        logger.error("Student speak");
    }
}
