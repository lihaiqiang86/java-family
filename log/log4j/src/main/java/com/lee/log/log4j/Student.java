package com.lee.log.log4j;

import org.apache.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Student extends Person {

    private static final Logger logger = Logger.getLogger(Student.class);

    @Override
    public void speak() {
        logger.trace("Student speak");
        logger.debug("Student speak");
        logger.info("Student speak");
        logger.warn("Student speak");
        logger.error("Student speak");
        logger.fatal("Student speak");
    }
}
