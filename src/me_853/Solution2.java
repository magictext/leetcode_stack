package me_853;

import java.util.ArrayList;

public class Solution2 {
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

		@Override
		public String toString() {
			return "Car [position=" + position + ", speed=" + speed + "]";
		}

	}

	public int carFleet(int target, int[] position, int[] speed) {
		ArrayList<Car> arrayList = new ArrayList<Car>();
		ArrayList<Integer> list = new ArrayList<>();
		int flag = 0;
		for (int x = 0; x < position.length; x++) {
			arrayList.add(new Car(position[x], speed[x]));
		}
		arrayList.sort(null);
		// System.out.println(arrayList.toString()+"hello");
		do {
			flag = 0;
			for (int t = arrayList.size() - 2; t >= 0; t--) {
				double time1 = (target - arrayList.get(t + 1).position) / arrayList.get(t + 1).speed;
				double time2 = (target - arrayList.get(t).position) / arrayList.get(t).speed;
				if (time1 >= time2) {
					if (!list.contains(t)) {
						flag = 1;
						list.add(t);
					}
				}
			}
			for (Integer integer : list) {
				arrayList.remove((int) integer);
			}
			list.clear();
		} while (flag == 1);
		System.out.println(list.toString());
		System.out.println(arrayList.size());

		return arrayList.size();
	}

	public static void main(String[] args) {
		// target = 12, position = [10,8,0,5,3], speed = []
		int position[] = { 10, 2, 5, 7, 4, 6, 11 };
		int speed[] = { 7, 5, 10, 5, 9, 4, 1 };
		System.out.println(new Solution2().carFleet(13, position, speed));
	}
}
