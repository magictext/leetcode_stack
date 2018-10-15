package me_71;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
	public String simplifyPath(String path) {
		if(path.equals("")) return path;
        Stack<String> stack=new Stack<>();
		String arr[]=path.split("/");
		//System.out.println(Arrays.toString(arr));
		for (String string : arr) {
			if(string.equals("..")){
				if (!stack.empty()) {
					stack.pop();
				}else {
					
				}
			}else if (string.equals("")) {
				
			}else if (string.equals(".")) {
				
			}else {
				stack.push(string);
			}
		}
		StringBuilder stringBuilder=new StringBuilder();
		for (String string : stack) {
			stringBuilder.append("/");
			stringBuilder.append(string);
		}
        path=stringBuilder.toString();
        if(path.equals("")) return "/";
		return path;
    }
    
	public static void main(String[] args) {
		String string="/home//foo/";
		System.out.println(new Solution().simplifyPath(string));
	}
}
