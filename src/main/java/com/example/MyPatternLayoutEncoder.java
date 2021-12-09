package com.example;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.PatternLayoutEncoderBase;

/**
 * @author Neo (jinsan.noh@dreamus.io)
 * @since 2021-12-10
 */
public class MyPatternLayoutEncoder extends PatternLayoutEncoderBase<ILoggingEvent> {
	
	@Override
	public void start() {
		this.layout = new CustomLayout();
		super.start();
	}
}
