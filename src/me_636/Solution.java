package me_636;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution {
//	public int[] exclusiveTime(int n, List<String> logs) {
//		Stack<String> stack=new Stack<>();
//		int res[]=new int[n];
//		Stack<Integer> stack2=new Stack<>();
//		int temptime=0;
//        for (String string : logs) {
//			String str[]=string.split(":");
//			if(str[1].equals("start")){
//				stack.push(str[0]+" "+str[2]);
//			}else if(str[1].equals("end")){
//				String x=stack.peek();
//				if(str[0].equals(x.split(" ")[0])){
//					stack.pop();
//					res[Integer.parseInt(str[0])]=res[Integer.parseInt(str[0])]+Integer.parseInt(str[2])-Integer.parseInt(x.split(" ")[1])+1;
//					temptime=res[Integer.parseInt(str[0])];
//				}
//			}
//		}
//        return res;
//    }
	class Log{
		String name;
		String zhuangtai;
		int weigth;
		public Log(String s) {
			super();
			String string[]=s.split(":");
			this.name = string[0];
			this.zhuangtai = string[1];
			this.weigth = Integer.parseInt(string[2]);
		}
		
	}
	public int[] exclusiveTime(int n, List<String> logs) {
		Stack<Log> stack=new Stack<>();
		int tempweigth=0;
		int res[]=new int[n];
        for (String string : logs) {
			Log log=new Log(string);
			if(log.zhuangtai.equals("start")){
				stack.push(log);
			}else if (log.zhuangtai.equals("end")) {
				Log log2=stack.pop();
				res[Integer.parseInt(log2.name)]+=log.weigth-log2.weigth+1;
				tempweigth=log.weigth-log2.weigth+1;
				for (Log i : stack) {
					i.weigth+=tempweigth;
				}
				tempweigth=0;
			}
		}
        return res;
    }
	public static void main(String[] args) {
		List<String>list=new ArrayList();
//	["0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"]
		list.add("0:start:0");
		list.add("0:start:2");
		list.add("0:end:5");
		list.add("1:start:6");
		list.add("1:end:6");
		list.add("0:end:7");
		System.out.println(Arrays.toString(new Solution().exclusiveTime(2, list)) );
	}
}
