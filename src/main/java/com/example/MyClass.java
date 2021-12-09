package com.example;

import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggingEventBuilder;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * @author Neo (jinsan.noh@dreamus.io)
 * @since 2021-12-09
 */
public class MyClass {
	
	
	public static void main(String[] args) {
		org.slf4j.Logger mySlf4jLogger = LoggerFactory.getLogger(MyClass.class);
		
		mySlf4jLogger.trace("This is TRACE level log");
		mySlf4jLogger.debug("This is DEBUG level log");
		mySlf4jLogger.info("This is INFO level log");
		mySlf4jLogger.warn("This is WARN level log");
		mySlf4jLogger.error("This is ERROR level log");
		
		LoggingEventBuilder loggingEventBuilder = mySlf4jLogger.makeLoggingEventBuilder(org.slf4j.event.Level.WARN);
		loggingEventBuilder.log("hello");
		
		System.out.println("mySlf4jLogger.getClass() = " + mySlf4jLogger.getClass());
	}
	
	public static void main2(String[] args) {
		Logger rootLogger = Logger.getLogger("");
		// RootLogger 이름은 empty string ""
		System.out.println("rootLogger.getName() = " + rootLogger.getName());
		// RootLogger 의 parent 는 없다.
		System.out.println("rootLogger.getParent() = " + rootLogger.getParent());

		rootLogger.setLevel(Level.ALL);
		Handler[] rootLoggerHandlers = rootLogger.getHandlers();
		for (Handler rootLoggerHandler : rootLoggerHandlers) {
			System.out.println("rootLoggerHandler = " + rootLoggerHandler);
			System.out.println("rootLoggerHandler.getLevel() = " + rootLoggerHandler.getLevel());
//			rootLoggerHandler.setLevel(Level.FINEST);
		}

		Logger logger = Logger.getLogger("com.example.web");
		System.out.println("logger.getParent() = " + logger.getParent());
		System.out.println("logger.getParent().getName() = [" + logger.getParent().getName() + "]");

		ConsoleHandler handler = new ConsoleHandler();
		handler.setLevel(Level.FINER);
		logger.addHandler(handler);

		Handler[] handlers = logger.getHandlers();
		for (Handler loggerHandler : handlers) {
			System.out.println("loggerHandler = " + loggerHandler);
			System.out.println("loggerHandler.getLevel() = " + loggerHandler.getLevel());
		}

		logger.log(Level.ALL, "This is ALL level log");
		logger.log(Level.FINEST, "This is FINEST level log");
		logger.log(Level.FINER, "This is FINER level log");
		logger.log(Level.FINE, "This is FINE level log");
		logger.log(Level.CONFIG, "This is CONFIG level log");
		logger.log(Level.INFO, "This is INFO level log");
		logger.log(Level.WARNING, "This is WARNING level log");
		logger.log(Level.SEVERE, "This is SEVERE level log");
		logger.log(Level.OFF, "This is OFF level log");

		System.out.println("logger.getClass() = " + logger.getClass());
	}
	
}
