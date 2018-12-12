package com.datastructure.Tree.depthofBinaryTree;

public class BinaryTreeDepth {
	static class Node {
		Node left;
		Node right;
		int data;
	}

	public static int height(Node node) {
		if (node == null) {
			return 0;
		}
		int hLeft = height(node.left);
		int hRight = height(node.right);
		int height = 1 + Math.max(hLeft, hRight);
		return height;
	}
}
