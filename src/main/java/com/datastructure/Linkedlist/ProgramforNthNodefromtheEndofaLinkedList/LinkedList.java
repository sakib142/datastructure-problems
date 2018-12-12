package com.datastructure.Linkedlist.ProgramforNthNodefromtheEndofaLinkedList;

/*
 * Method 2 (Use two pointers) 
   Maintain two pointers – reference pointer and main pointer. 
   Initialize both reference and main pointers to head.
   First move reference pointer to n nodes from head. Now move both pointers one by one until reference pointer reaches end. 
   Now main pointer will point to nth node from the end. Return main pointer.
 * 
 */

//Java program to find n'th node from end using slow and fast pointers
class LinkedList {
	Node head; // head of the list

	/* Linked List node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/* Function to get the nth node from end of list */
	void printNthFromLast(int n) {
		Node main_ptr = head;
		Node ref_ptr = head;

		int count = 0;
		if (head != null) {
			while (count < n) {
				if (ref_ptr == null) {
					System.out.println(n + " is greater than the no " + " of nodes in the list");
					return;
				}
				ref_ptr = ref_ptr.next;
				count++;
			}
			while (ref_ptr != null) {
				main_ptr = main_ptr.next;
				ref_ptr = ref_ptr.next;
			}
			System.out.println("Node no. " + n + " from last is " + main_ptr.data);
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Drier program to test above methods */
	public static void main(String[] args) {
		LinkedList llist = new LinkedList();
		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(35);

		llist.printNthFromLast(4);
	}
}