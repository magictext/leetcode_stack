package me_103;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
	

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> arrayList = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();
		int deep = 1;
		stack.add(root);
		while (!stack.empty()) {
			List<Integer> templist = new ArrayList<>();
			Stack<TreeNode> tempstack = new Stack<>();
			if (deep % 2 != 0) {
				while(!stack.empty()){
					TreeNode temp = stack.pop();
					templist.add(temp.val);
					if (temp.left != null) {
						tempstack.add(temp.left);
					}
					if (temp.right != null) {
						tempstack.add(temp.right);
					}
				}
				arrayList.add(templist);
				//arrayList.clear();
				stack = (Stack<TreeNode>) tempstack.clone();
				//templist.clear();
				deep++;
			} else {
				while (!stack.empty()) {
					TreeNode temp = stack.pop();
					templist.add(temp.val);
					if (temp.right != null) {
						tempstack.push(temp.right);
					}
					if (temp.left != null) {
						tempstack.push(temp.left);
					}
				}
				arrayList.add(templist);
				//templist.clear();
				stack = (Stack<TreeNode>) tempstack.clone();
				//templist.clear();
				deep++;
			}
		}
		return arrayList;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode rNode = root;
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(1);
		root.right.left = new TreeNode(5);
		System.out.println(root.toString());
		System.out.println(new Solution().zigzagLevelOrder(root).toString());
	}
}
