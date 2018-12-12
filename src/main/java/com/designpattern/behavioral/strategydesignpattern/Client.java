package com.designpattern.behavioral.strategydesignpattern;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
		CompressionContext ctx = new CompressionContext();
		// we could assume context is already set by preferences
		ctx.setCompressionStrategy(new ZipCompressionStrategy());
		// get a list of files...
		ctx.createArchive(new ArrayList<>());
	}
}