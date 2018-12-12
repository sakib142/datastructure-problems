
package com.thread.future;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author sakib
 * 
 * http://jovialjava.blogspot.in/2011/01/part-7-javautilconcurrent-invokeall-via.html
 *
 */
public class InvokeAllExample {

	private static final ExecutorService executorPool = Executors.newFixedThreadPool(20);
	private static final int NO_OF_CLIENT = 200;
	private static final String FILE_EXT = ".txt";
	private static String TXN_DATA = "SOME RANDOM TXN DATA FOR CLIENT --> ";
	private static String DIRECTORY = "EXAMPLE" + File.separator;

	static {
		if (!new File(DIRECTORY).isDirectory()) {
			new File(DIRECTORY).mkdir();
		}
	}

	public static void main(String[] args) {
		int success = 0;
		int failure = 0;
		/**
		 * Lets assume we have 1000 clients connected and sending request at a time.
		 */
		Collection<FileTask> collection = new ArrayList<FileTask>();
		for (int i = 0; i < NO_OF_CLIENT; i++) {
			FileTask task = new FileTask(DIRECTORY + Integer.toString(i) + FILE_EXT, TXN_DATA + i);
			collection.add(task);
		}
		long startTime = new Date().getTime();
		try {
			List<Future<Boolean>> list = executorPool.invokeAll(collection);
			for (Future<Boolean> fut : list) {
				int ignore = fut.get() ? success++ : failure++;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("TOTAL SUCCESS - " + success);
			System.out.println("TOTAL FAILURE - " + failure);
			System.out.println("Total time - " + (new Date().getTime() - startTime) + " ms");
			executorPool.shutdown();
		}
	} // End of Main

}