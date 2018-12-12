package com.thread.customThreadpool;

public class TestThreadPool {
	public static void main(String[] args) {
		ThreadPool pool = new ThreadPool(7);

		for (int i = 0; i < 5; i++) {
			Task task = new Task(i);
			pool.execute(task);
		}
	}
}