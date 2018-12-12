package com.designpattern.behavioral.observerdesignpattern;

public class HexaConsumer extends Consumer {

	public HexaConsumer(KafkaTopic subject) {
		this.topic = subject;
		this.topic.register(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " + Integer.toHexString(topic.getState()).toUpperCase());
	}
}
