package easy_844;

import java.util.Stack;

public class Solution {
	public boolean backspaceCompare(String S, String T) {
		char ch[] = S.toCharArray();
		char tch[] = T.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (char c : ch) {
			if (c == '#') {
				if (stack.empty()) {
					continue;
				} else {
					stack.pop();
				}
			} else {
				stack.push(c);
			}
		}
		ch = new char[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			ch[i] = stack.get(i);
		}
		stack.clear();
		for (char c : tch) {
			if (c == '#') {
				if (stack.empty()) {
					continue;
				} else {
					stack.pop();
				}
			} else {
				stack.push(c);
			}
		}
		tch = new char[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			tch[i] = stack.get(i);
		}

		S = new String(ch);
		T = new String(tch);
		System.out.println(S + '\t' + T);
		return S.equals(T);
	}

	public static void main(String[] args) {
		String S = "ab#c";
		String T = "ad#c";
		System.out.println(new Solution().backspaceCompare(S, T));	
	}
}
