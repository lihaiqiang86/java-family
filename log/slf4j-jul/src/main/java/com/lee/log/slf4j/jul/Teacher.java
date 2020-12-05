package com.lee.log.slf4j.jul;

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
        logger.trace("trace: Teacher speak");
        logger.debug("debug: Teacher speak");
        logger.info("info: Teacher speak");
        logger.warn("warn: Teacher speak");
        logger.error("error: Teacher speak");
    }
}
