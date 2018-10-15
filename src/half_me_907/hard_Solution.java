package half_me_907;

import java.util.Arrays;
//以为是乱序选择最小数组
public class hard_Solution {
	int count=0;
	public int sumSubarrayMins(int[] arr) {
		Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
        	Doing(arr,i);
        }
        return count;
    }
	private void Doing(int[] arr, int i) {
		i--;
		for(int x=0;x<arr.length;x++){
			count+=arr[x]*C(x, arr.length);
			//C:i/arr.length-x;
		}
	}
	private int  C(int x,int length) {
		int sum=1;
		for(int t=length-x+1;t<length+1;t++){
			sum*=t;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int arr[]={3,1,2,4};
		System.out.println(new hard_Solution().sumSubarrayMins(arr));
	}
}
