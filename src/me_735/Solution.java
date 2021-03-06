package me_735;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.BrokenBarrierException;

/*给定一个整数数组 asteroids，表示在同一行的行星。

对于数组中的每一个元素，其绝对值表示行星的大小，正负表示行星的移动方向（正表示向右移动，负表示向左移动）。每一颗行星以相同的速度移动。

找出碰撞后剩下的所有行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。

示例 1:

输入: 
asteroids = [5, 10, -5]
输出: [5, 10]
解释: 
10 和 -5 碰撞后只剩下 10。 5 和 10 永远不会发生碰撞。

示例 2:

输入: 
asteroids = [8, -8]
输出: []
解释: 
8 和 -8 碰撞后，两者都发生爆炸。
*/
public class Solution {
	public int[] asteroidCollision(int[] asteroids) {
		Stack<Integer> stack = new Stack<>();
		for (int i : asteroids) {
			if (stack.empty()) {
				stack.push(i);
			} else {
				while (true) {
					if (!stack.empty()) {
						if (stack.peek() > 0 && i < 0) {
							if (Math.abs(stack.peek()) < Math.abs(i)) {
								stack.pop();
							} else if (Math.abs(stack.peek()) == Math.abs(i)) {
								stack.pop();
								break;
							} else {
								break;
							}
						} else {
							stack.push(i);
							break;
						}
					} else {
						stack.push(i);
						break;
					}
				}

			}
		}
		int res[] = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			res[i] = stack.get(i);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { -2, -2, 1, -2 };
		System.out.println(Arrays.toString(new Solution().asteroidCollision(arr)));
	}
}
