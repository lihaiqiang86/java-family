package com.lee.log.log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author lihaiqiang
 * @since 2020/12/1
 */
public class Teacher extends Person {

    private static final Logger logger = LogManager.getLogger(Person.class);

    @Override
    public void speak(String message) {
        logger.trace("Teacher speak: {}", message);
        logger.debug("Teacher speak: {}", message);
        logger.info("Teacher speak: {}", message);
        logger.warn("Teacher speak: {}", message);
        logger.error("Teacher speak: {}", message);
        logger.fatal("Teacher speak: {}", message);
    }
}
