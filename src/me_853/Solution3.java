package me_853;

import java.util.ArrayList;

import me_853.Solution2.Car;

public class Solution3 {
	class Car implements Comparable<Car> {
		int position;
		int speed;
		double time;
		

		public Car(int position, int speed) {
			super();
			this.position = position;
			this.speed = speed;
			this.time=(double)(target-position)/speed;
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
			return "Car [position=" + position + ", speed=" + speed + ", time=" + time + "]";
		}

	
	}
	int target=0;
	public int carFleet(int target1, int[] position, int[] speed) {
		ArrayList<Car> arrayList = new ArrayList<Car>();
		ArrayList<Integer> list = new ArrayList<>();
		target=target1;
		int count=1;
		for (int x = 0; x < position.length; x++) {
			arrayList.add(new Car(position[x], speed[x]));
		}
		arrayList.sort(null);
		System.out.println(arrayList.toString());
		double max=arrayList.get(arrayList.size()-1).time;
		// System.out.println(arrayList.toString()+"hello");
		for(int x=arrayList.size()-1;x>=0;x--){
			if(arrayList.get(x).time>max){
				count++;
				max=arrayList.get(x).time;
			}
			
		}
		return count;
	}

	public static void main(String[] args) {
		// target = 12, position = [10,8,0,5,3], speed = []
		int position[] = { 10, 2, 5, 7, 4, 6, 11 };
		int speed[] = { 7, 5, 10, 5, 9, 4, 1 };
		System.out.println(new Solution3().carFleet(13, position, speed));
	}
}
