package com.lee.log.logback;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Person {

    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    public void speak(String message) {
        logger.trace("Person speak: {}", message);
        logger.debug("Person speak: {}", message);
        logger.info("Person speak: {}", message);
        logger.warn("Person speak: {}", message);
        logger.error("Person speak: {}", message);
    }
}
