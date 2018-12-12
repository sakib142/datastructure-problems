package com.datastructure.Tree.mirrorBinaryTree;

/*
Mirroring will change any given tree into its mirror image. For example,
This tree...
	7
   / \
   4 9
   / \
   1 3
Will be changed to...
    7
   / \
   9 4
   / \
   3 1 
 */
public class MirrorBinaryTree {

	class Node {
		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	private void mirror(Node node) {
		if (node != null) {
			// do the sub-trees
			mirror(node.left);
			mirror(node.right);
			// swap the left/right pointers
			Node temp = node.left;
			node.left = node.right;
			node.right = temp;
		}
	}
}
