package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jDemo {
    private static final Logger logger =
            LoggerFactory.getLogger(Slf4jDemo.class);

    public static void main(String[] args) {
        logger.info("Application started");
        logger.error("Error occured");
    }
}
