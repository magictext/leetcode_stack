package me_853;

import java.util.ArrayList;
import java.util.Arrays;

import javax.smartcardio.Card;

public class Solution {
	class Car implements Comparable<Car> {
		int position;
		int speed;

		public Car(int position, int speed) {
			super();
			this.position = position;
			this.speed = speed;
		}

		public void next() {
			position += speed;
			// return position;
		}

		public void pre() {
			position -= speed;
		}

		@Override
		public int compareTo(Car o) {
			// TODO Auto-generated method stub
			return this.position - o.position;
		}
	}

	public int carFleet(int target, int[] position, int[] speed) {
		ArrayList<Car> arrayList = new ArrayList<Car>();
		int flag = 0;
		for (int x = 0; x < position.length; x++) {
			arrayList.add(new Car(position[x], speed[x]));
		}
		arrayList.sort(null);
		do {
			flag = 1;
			for (int x = 0; x < arrayList.size(); x++) {
				arrayList.get(x).next();

			}
			for (int x = 1; x < arrayList.size(); x++) {
				if (arrayList.get(x - 1).position >= arrayList.get(x).position)
					if (arrayList.get(x - 1).position <= target) {
						arrayList.remove(x - 1);
					} else {
						if (arrayList.get(x).position<=target) {
							arrayList.remove(x - 1);
						} else {
							int time1=(target-arrayList.get(x-1).position)/arrayList.get(x-1).speed;
							int time2=(target-arrayList.get(x).position)/arrayList.get(x).speed;
							if(time1<=time2) arrayList.remove(x-1);
						}
					}
			}
			if (arrayList.get(0).position >= target)
				flag = 0;
		} while (flag == 1);

		return arrayList.size();
	}

	public static void main(String[] args) {
		// target = 12, position = [10,8,0,5,3], speed = []
		int position[] = {10,2,5,7,4,6,11};
		int speed[] = {7,5,10,5,9,4,1};
		System.out.println(new Solution().carFleet(13, position, speed));
	}
}
