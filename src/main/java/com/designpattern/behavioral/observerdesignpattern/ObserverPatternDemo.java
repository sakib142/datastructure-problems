package com.designpattern.behavioral.observerdesignpattern;

public class ObserverPatternDemo {
	public static void main(String[] args) {
		KafkaTopic subject = new KafkaTopic();

		new HexaConsumer(subject);
		new OctalConsumer(subject);
		new BinaryConsumer(subject);

		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}
}
