package com.designpattern.behavioral.observerdesignpattern;

public class OctalConsumer extends Consumer {

	public OctalConsumer(KafkaTopic subject) {
		this.topic = subject;
		this.topic.register(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(topic.getState()));
	}
}