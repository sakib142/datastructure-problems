package com.datastructure.Tree.IsBinarySearchTree;

import java.util.Deque;
import java.util.LinkedList;

public class IsBST {

	class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public boolean isBST(Node root) {
		return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	/* Let us create following BST
       50
    /     \
  30       70
 /  \     /  \
20   40  60   80 */

	// Recursive Function for checking if tree is IS BST or not
	private boolean isBST(Node root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data > max) {
			return false;
		}
		return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
	}

	public boolean isBSTIterative(Node root) {
		if (root == null) {
			return true;
		}

		Deque<Node> stack = new LinkedList<>();
		Node node = root;
		int prev = Integer.MIN_VALUE;
		int current;
		while (true) {
			if (node != null) {
				stack.addFirst(node);
				node = node.left;
			} else {
				if (stack.isEmpty()) {
					break;
				}
				node = stack.pollFirst();
				current = node.data;
				if (current < prev) {
					return false;
				}
				prev = current;
				node = node.right;
			}
		}
		return true;
	}

}
