package com.lee.log.slf4j.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Teacher extends Person {

    private static final Logger logger = LoggerFactory.getLogger(Teacher.class);

    @Override
    public void speak() {
        logger.trace("Teacher speak");
        logger.debug("Teacher speak");
        logger.info("Teacher speak");
        logger.warn("Teacher speak");
        logger.error("Teacher speak");
    }
}
