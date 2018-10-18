package me_856;

import java.util.HashMap;
import java.util.Stack;

public class Solution {
	
	public int scoreOfParentheses(String S) {
		int  res = 0;
		char arr[] = S.toCharArray();
		int temp=0;
		Stack<Integer> stack = new Stack<>();
		for (int i=0;i<arr.length;i++) {
			if(arr[i]=='('){
				stack.push(i);
			}else {
				if (stack.size()==1) {
					res+=doing(arr,stack.pop()+1,i-1);
					
				}else stack.pop();
			}
		}
		return res;
	}

	private int doing(char[] arr, int i, int j) {
		if(j-i<=0) return 1;
		//if(j-i==1) return 2;
		int temp = 0;
		Stack<Integer> stack = new Stack<>();
		for (;i<=j;i++) {
			if(arr[i]=='('){
				stack.push(i);
			}else {
				if (stack.size()==1) {
					temp+=2*doing(arr,stack.pop()+1,i-1);
					System.out.println("main");
					System.out.println(temp);
				}else stack.pop();
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		System.out.println(new Solution().scoreOfParentheses("()"));
	}
	
}
