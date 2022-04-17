package com.revature.fsd.junitdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
	
	private static Logger LOGGER = LoggerFactory.getLogger(LoggerDemo.class);

	public static void main(String[] args) {
		LOGGER.trace("TRACE message");
		LOGGER.debug("DEBUG message");
		LOGGER.info("INFO message");
		LOGGER.warn("WARN message");
		LOGGER.error("ERROR message");
	}

}
