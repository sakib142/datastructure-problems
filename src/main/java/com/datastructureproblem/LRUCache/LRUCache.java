package com.datastructureproblem.LRUCache;

import java.util.HashMap;
// 
//
/**
 * @author sakib
 * 
 * Using Customized Double linked list
 * https://www.youtube.com/watch?v=ps8zr0TqNCw
 * 
 * We can't use the DLL directly because all the operation takes O(n) time complexity
 * 
 * We can't use The Queue because its a FIFO operation So always the deletion happens only at the TAIL
 * but in this case we can delete from any of the position
 *
 */
public class LRUCache {

	int capacity;
	HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public void put(int key, int value) {
		if (map.containsKey(key)) {
			Node old = map.get(key);
			old.value = value;
			remove(old);
			setHead(old);
		} else {
			Node created = new Node(key, value);
			if (map.size() >= capacity) {
				map.remove(end.key);
				remove(end);
				setHead(created);

			} else {
				setHead(created);
			}

			map.put(key, created);
		}
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			Node n = map.get(key);
			remove(n);
			setHead(n);
			return n.value;
		}

		return -1;
	}

	public void remove(Node n) {
		if (n.pre != null) {
			n.pre.next = n.next;
		} else {
			head = n.next;
		}

		if (n.next != null) {
			n.next.pre = n.pre;
		} else {
			end = n.pre;
		}

	}

	public void setHead(Node n) {
		n.next = head;
		n.pre = null;

		if (head != null)
			head.pre = n;

		head = n;

		if (end == null)
			end = head;
	}

	public void print(Node nn) {
		Node cur = nn;
		while (cur != null) {
			System.out.print(cur.value + " ");
			cur = cur.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {

		// DLL is opposite of queue as we insert at front and remove from rear
		LRUCache ob = new LRUCache(3);
		ob.put(7, 7);
		ob.put(0, 0);
		ob.put(1, 1);
		ob.put(2, 2);
		ob.put(0, 0);
		ob.put(3, 3);
		ob.put(0, 0);
		ob.put(4, 4);
		ob.put(2, 2);
		ob.put(3, 3);
		ob.put(0, 0);
		ob.put(3, 3);
		ob.put(2, 2);
		ob.put(1, 1);
		ob.put(2, 2);
		ob.print(ob.head);

	}
}