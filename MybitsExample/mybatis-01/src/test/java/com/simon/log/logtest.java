package com.simon.log;

import org.apache.log4j.Logger;
import org.junit.Test;

public class logtest {
    static Logger logger = Logger.getLogger(logtest.class);

    @Test
    public void log4j() {
        logger.info("log4j");
        logger.debug("log4j");
        logger.error("log4j");
    }
}
