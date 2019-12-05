package com.jpm.log4j;


import org.apache.logging.log4j.*;

public class log4jDemo {
    static Logger log= LogManager.getLogger(log4jDemo.class);

    public static void main(String[] args) {
        log.debug("Debug");
        log.trace("Trace");
        log.fatal("FATAL");
        log.error("EROOR");
        log.warn("WARN");
        log.info("INFO");
    }
}
