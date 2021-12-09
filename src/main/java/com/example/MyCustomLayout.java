package com.example;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

import java.util.Arrays;

/**
 * @author Neo (jinsan.noh@dreamus.io)
 * @since 2021-12-10
 */
public class MyCustomLayout extends LayoutBase<ILoggingEvent> {
	
	@Override
	public String doLayout(ILoggingEvent event) {
		System.out.println("event = " + event);
		System.out.println("event.getLevel() = " + event.getLevel());
		System.out.println("event.getLoggerName() = " + event.getLoggerName());
		System.out.println("event.getThreadName() = " + event.getThreadName());
		System.out.println("event.getCallerData() = " + Arrays.toString(event.getCallerData()));
		System.out.println("event.getMDCPropertyMap() = " + event.getMDCPropertyMap());
		System.out.println("event.getFormattedMessage() = " + event.getFormattedMessage());
		
		return "this is my customLayout [" + event.getLevel() + "] : " + event.getFormattedMessage();
	}
}

