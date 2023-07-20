package Arrays_Interview;

import java.util.Arrays;

public class Smallest_Number_Array {
	
	
	public static int smallNumber(int[] a , int total)
	{
		Arrays.sort(a);
		
		return a[0];
	
		
	}
	
	
	

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(smallNumber(arr, arr.length));

	}

}
