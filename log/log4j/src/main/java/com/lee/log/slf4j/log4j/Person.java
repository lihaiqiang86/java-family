package com.lee.log.slf4j.log4j;

import org.apache.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Person {

    private static final Logger logger = Logger.getLogger(Person.class);

    public void speak() {
        logger.trace("Person speak");
        logger.debug("Person speak");
        logger.info("Person speak");
        logger.warn("Person speak");
        logger.error("Person speak");
        logger.fatal("Person speak");
    }
}
