package com.designpattern.behavioral.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class KafkaTopic {
	
	private List<Consumer> consumers = new ArrayList<Consumer>();
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllConsumers();
	}

	public void register(Consumer observer) {
		consumers.add(observer);
	}

	public void notifyAllConsumers() {
		for (Consumer consumer : consumers) {
			consumer.update();
		}
	}
}
