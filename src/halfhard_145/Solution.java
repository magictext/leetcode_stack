package halfhard_145;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	static ArrayList<Integer> arrayList = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		thenext(root);
		ArrayList<Integer> arrayList1 = (ArrayList<Integer>) arrayList.clone();
		arrayList.clear();
		return arrayList1;
	}

	public void thenext(TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				thenext(root.left);
			}
			
			if (root.right != null) {
				thenext(root.right);
			}
			arrayList.add(root.val);
		}
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
		System.out.println(new Solution().inorderTraversal(root));
	}

}
