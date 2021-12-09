package com.example;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;

/**
 * @author Neo (jinsan.noh@dreamus.io)
 * @since 2021-12-10
 */
public class CustomLayout extends LayoutBase<ILoggingEvent> {
	
	@Override
	public String doLayout(ILoggingEvent event) {
		return "customLayout [" + event.getLevel() + "] : " + event.getFormattedMessage();
	}
}
