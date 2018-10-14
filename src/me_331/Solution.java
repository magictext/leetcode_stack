package me_331;

public class Solution {
		public boolean isValidSerialization(String preorder) {
			String[] x = preorder.split(",");
			if (findTree(x, 0) == x.length) {
				return true;
			}
			return false;
		}

		private int findTree(String[] x, int start) {
			if (x.length - start == 0) {
				return -1;
			}
			if (x[start].equals("#")) {
				return start + 1;
			}
			int left = findTree(x, start + 1);
			if (left < 0) {
				return -1;
			}
			int right = findTree(x, left);
			if (right < 0) {
				return -1;
			}
			return right;
		}
	}


