package com.practice;

public class LinkedlistTest {
	static Node head;
	static Node head1;

	class Node {
		int key;
		Node next;

		public Node(int key) {
			super();
			this.key = key;
			next = null;
		}

	}

	public void pushintofirstlinkedlist(int key) {
		Node new_node = new Node(key);
		new_node.next = head;
		head = new_node;

	}
	
	public void pushintoSecondlinkedlist(int key) {
		Node new_node = new Node(key);
		new_node.next = head1;
		head1 = new_node;

	}
	
	public static void main(String[] args) {
		LinkedlistTest linkedlistTest = new LinkedlistTest();
		linkedlistTest.pushintofirstlinkedlist(1);
		linkedlistTest.pushintofirstlinkedlist(21);
		linkedlistTest.pushintofirstlinkedlist(3);
		linkedlistTest.pushintofirstlinkedlist(40);
		linkedlistTest.pushintofirstlinkedlist(5);
		linkedlistTest.pushintofirstlinkedlist(11);
		
		printFirstLinkedListVal();
		
		LinkedlistTest linkedlistTest1 = new LinkedlistTest();
		linkedlistTest1.pushintoSecondlinkedlist(100);
		linkedlistTest1.pushintoSecondlinkedlist(219);
		linkedlistTest1.pushintoSecondlinkedlist(30);
		linkedlistTest1.pushintoSecondlinkedlist(401);
		linkedlistTest1.pushintoSecondlinkedlist(5);
		linkedlistTest1.pushintoSecondlinkedlist(110);
		
		printSecondLinkedListVal();
		
	}

	private static void printFirstLinkedListVal() {
		while(head!=null) {
			System.out.println(head.key);
			head = head.next;
		}
	}
	private static void printSecondLinkedListVal() {
		while(head1!=null) {
			System.out.println(head1.key);
			head1 = head1.next;
		}
	}
}
