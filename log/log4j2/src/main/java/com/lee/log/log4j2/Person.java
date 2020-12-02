package com.lee.log.log4j2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Person {

    private static final Logger logger = LogManager.getLogger(Person.class);

    public void speak(String message) {
        logger.trace("Person speak: {}", message);
        logger.debug("Person speak: {}", message);
        logger.info("Person speak: {}", message);
        logger.warn("Person speak: {}", message);
        logger.error("Person speak: {}", message);
        logger.fatal("Person speak: {}", message);
    }
}
