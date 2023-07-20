package Arrays_Interview;

import java.util.Arrays;

public class Second_Smallest_Element {
	
	public static int secondSmallest(int[] a , int total) {
		
		Arrays.sort(a);
		return a[1];
	}
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Second Smallest" + secondSmallest(arr, arr.length));

	}

}
