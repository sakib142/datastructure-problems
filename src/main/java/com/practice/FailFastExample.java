package com.practice;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastExample {

	public static void main(String args[]) {

		Set<String> hashSet = new HashSet<String>();
		hashSet.add("audi");
        CopyOnWriteArrayList<String> s=new CopyOnWriteArrayList<String>();
        s.add("Upendra");
        s.add("UJJJ");
        
		// fail-fast
		Iterator<String> iterator = hashSet.iterator();
		Iterator<String> iter=s.iterator();
		while(iter.hasNext()){
			s.add("DDDD");
			System.out.println(iter.next());
		}
		
		/*while (iterator.hasNext()) {
			hashSet.add("newElement1"); // unComment to avoid
										// ConcurrentModificationException
			System.out.println(iterator.next());
		}

		// fail-fast
		Enumeration<String> listEnum = Collections.enumeration(hashSet);
		while (listEnum.hasMoreElements()) {
			hashSet.add("newElement2"); // unComment to avoid
										// ConcurrentModificationException
			System.out.println(listEnum.nextElement());
		}

		// enhanced for loop is fail-fast
		for (String string : hashSet) {
			hashSet.add("newElement3"); // unComment to avoid
										// ConcurrentModificationException
			System.out.println(string);
		}*/

	}
}
