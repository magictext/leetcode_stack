package unsolved_hard_224;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import javax.print.attribute.standard.MediaName;

public class Solution {
	public int calculate(String s) {
        char ch[]=s.toCharArray();
        ArrayList<Character> arrayList=new ArrayList<>();
        Stack<Integer> stack=new Stack<>();
        for (int x=0;x<s.length();x++) {
        	if(ch[x]=='('){
				stack.push(x);
			}else if (ch[x]==')') {
				stack.pop();
				//arrayList.add((char)(cacu(ch,stack.pop(),i)));
			}
        	if(stack.empty()){
        		switch (ch[x+1]) {
				case '+':
					return calculate(new String(Arrays.copyOfRange(ch, 0, x+1)))+calculate(new String(Arrays.copyOfRange(ch, x+1, ch.length)));

				case '-':
					return calculate(new String(Arrays.copyOfRange(ch, 0, x+1)))-calculate(new String(Arrays.copyOfRange(ch, x+1, ch.length)));

				case '*':
					return calculate(new String(Arrays.copyOfRange(ch, 0, x+1)))*calculate(new String(Arrays.copyOfRange(ch, x+1, ch.length)));

				case '/':
					return calculate(new String(Arrays.copyOfRange(ch, 0, x+1)))/calculate(new String(Arrays.copyOfRange(ch, x+1, ch.length)));
				default:
					return 0;
				}
        		
        	}
		}
        
        
    
//        for (int i=0;i<ch.length;i++) {
//			if(ch[i]=='('){
//				stack.push(i);
//			}else if (ch[i]==')') {
//				arrayList.add((char)(cacu(ch,stack.pop(),i)));
//			}else {
//				arrayList.add(ch[i]);
//			}
//		}
    }
	private char cacu(char[] ch, Integer pop, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	public static void main(String[] args) {
		
	}
}
