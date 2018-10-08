package easy_682;

import java.util.Stack;

public class Solution {
	public int calPoints(String[] ops) {
		Stack<Integer> stack=new Stack<>();
        for (String string : ops) {
			if (string.equals("+")) {
				try {
					stack.push(stack.get(stack.size()-2)+stack.peek());
				} catch (Exception e) {
					return 0;
				}
			}else if (string.equals("D")) {
				stack.push(stack.peek()*2);
			}else if (string.equals("C")) {
				stack.pop();
			}else {
				stack.push(Integer.valueOf(string));
			}
		}
        int sum=0;
        for (Integer integer : stack) {
			sum+=integer;
		}
        return sum;
    }
	public static void main(String[] args) {
		String string[]={"5","2","C","D","+"};
		System.out.println(new Solution().calPoints(string));
	}
}
