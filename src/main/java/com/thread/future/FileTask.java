package com.thread.future;

import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.Callable;

class FileTask implements Callable<Boolean> {

	private String name = null;
	private String data = null;

	public FileTask(String name, String data) {
		this.name = name;
		this.data = data;
	}

	public Boolean call() {
		try {
			File file = new File(this.name);
			PrintWriter writer = new PrintWriter(file);
			writer.write(this.data);
			writer.close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
