package half_me_907;

public class Solution {

	public int sumSubarrayMins(int[] arr) {
		int count = 0;
		if (arr.length == 0)
			return 0;
		int temp[] = arr.clone();
		for (int i = 1; i < arr.length + 1; i++) {
			for (int j = 0; j < temp.length - i + 1; j++) {
				if (temp[j] > arr[j + i - 1]) {
					temp[j] = arr[j + i - 1];
				}
				System.out.println(temp[j]);
				count += temp[j];
				if(count>1000000007) count=count%1000000007;
			}
		}
		
		return count;
	}

	private void Doing(int[] arr, int i) {

	}

	public static void main(String[] args) {
		int arr[] = { 3, 1, 2, 4 };
		System.out.println(new Solution().sumSubarrayMins(arr));
	}
}
