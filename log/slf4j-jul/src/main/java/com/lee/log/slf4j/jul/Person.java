package com.lee.log.slf4j.jul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Person {

    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    public void speak() {
        logger.trace("trace: Person speak");
        logger.debug("debug: Person speak");
        logger.info("info: Person speak");
        logger.warn("warn: Person speak");
        logger.error("error: Person speak");
    }
}
