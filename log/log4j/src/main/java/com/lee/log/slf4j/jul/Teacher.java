package com.lee.log.slf4j.jul;

import org.apache.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Teacher extends Person {

    private static final Logger logger = Logger.getLogger(Teacher.class);

    @Override
    public void speak() {
        logger.trace("Teacher speak");
        logger.debug("Teacher speak");
        logger.info("Teacher speak");
        logger.warn("Teacher speak");
        logger.error("Teacher speak");
        logger.fatal("Teacher speak");
    }
}
