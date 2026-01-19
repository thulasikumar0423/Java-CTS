package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
    private static final Logger logger  =
    LogManager.getLogger(Log4jDemo.class);

    public static void main(String [] args){
        logger.trace("Trace Message");
        logger.debug("Debug Message");
        logger.info("Info message");
        logger.warn("Warning Message");
        logger.error("Error Message");
        logger.fatal("Fatal Message");
    }
}
