package com.designpattern.behavioral.observerdesignpattern;

public class BinaryConsumer extends Consumer {

	public BinaryConsumer(KafkaTopic topic) {
		this.topic = topic;
		this.topic.register(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(topic.getState()));
	}
}