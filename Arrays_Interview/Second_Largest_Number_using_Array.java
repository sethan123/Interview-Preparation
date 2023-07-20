package Arrays_Interview;

import java.util.Arrays;

public class Second_Largest_Number_using_Array {

public static int getLarge(int[] a, int total) {
		
		Arrays.sort(a);
		return a[total-2];
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		int arr[]= {1,3,4,43,43,0,32,33,89};	
		
		System.out.println(getLarge(arr, arr.length));
	}

}
