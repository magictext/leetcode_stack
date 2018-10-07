package leetcode_735;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.BrokenBarrierException;

/*����һ���������� asteroids����ʾ��ͬһ�е����ǡ�

���������е�ÿһ��Ԫ�أ������ֵ��ʾ���ǵĴ�С��������ʾ���ǵ��ƶ���������ʾ�����ƶ�������ʾ�����ƶ�����ÿһ����������ͬ���ٶ��ƶ���

�ҳ���ײ��ʣ�µ��������ǡ���ײ�������������໥��ײ����С�����ǻᱬը������������Ǵ�С��ͬ�����������Ƕ��ᱬը�������ƶ�������ͬ�����ǣ���Զ���ᷢ����ײ��

ʾ�� 1:

����: 
asteroids = [5, 10, -5]
���: [5, 10]
����: 
10 �� -5 ��ײ��ֻʣ�� 10�� 5 �� 10 ��Զ���ᷢ����ײ��

ʾ�� 2:

����: 
asteroids = [8, -8]
���: []
����: 
8 �� -8 ��ײ�����߶�������ը��
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
