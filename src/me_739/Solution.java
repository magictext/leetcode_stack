package me_739;

import java.util.Arrays;
import java.util.Stack;
import javafx.util.Pair;

public class Solution {
	
	public int[] dailyTemperatures(int[] temperatures) {
		if(temperatures.length==0) return null;
		Stack<Pair<Integer, Integer>> stack = new Stack<>();
		for (int i = 0; i < temperatures.length; i++) {
			while (!stack.empty() && temperatures[i] > stack.peek().getValue()) {
				temperatures[stack.peek().getKey()] = i - stack.peek().getKey();
				stack.pop();
			}
			if (i<temperatures.length-1&&temperatures[i] < temperatures[i + 1]) {
				temperatures[i] = 1;

			} else {
				stack.push(new Pair<Integer, Integer>(i, temperatures[i]));
				temperatures[i] = 0;
			}

		}
		temperatures[temperatures.length - 1] = 0;
		return temperatures;
	}

	public static void main(String[] args) {
		int temperatures[] = {77,77,77,77,77,41,77,41,41,77};
		System.out.println(Arrays.toString(new Solution().dailyTemperatures(temperatures)));
	}
}
