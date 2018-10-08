package me_173;

import java.util.Stack;

public class BSTIterator {
	Stack<TreeNode> stack = new Stack<TreeNode>();

	public BSTIterator(TreeNode root) {
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	public boolean hasNext() {
		return !stack.isEmpty();
	}

	public int next() {
		TreeNode min = stack.pop();
		if (min.right != null) {
			TreeNode rightNode = min.right;
			while (rightNode != null) {
				stack.push(rightNode);
				rightNode = rightNode.left;
			}
		}
		return min.val;
	}

}
