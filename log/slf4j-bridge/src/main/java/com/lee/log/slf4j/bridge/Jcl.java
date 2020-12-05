package com.lee.log.slf4j.bridge;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author lihaiqiang
 * @since 2020/12/5
 */
public class Jcl {

    private static final Log logger = LogFactory.getLog(Jcl.class);

    public void speak(String message) {
        logger.trace("trace: Jcl speak: " + message);
        logger.debug("debug: Jcl speak: " + message);
        logger.info("info: Jcl speak: " + message);
        logger.warn("warn: Jcl speak: " + message);
        logger.error("error: Jcl speak: " + message);
        logger.fatal("fatal: Jcl speak: " + message);
    }
}
