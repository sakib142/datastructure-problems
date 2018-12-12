package com.designpattern.behavioral.observerdesignpattern;

public abstract class Consumer {
	protected KafkaTopic topic;

	public abstract void update();
}