package Arrays_Interview;

import java.util.Arrays;

public class sort_descending_order {

	public static void main(String[] args) {
		int arr[]= {1,3,4,43,43,0,32,33};
		
		Arrays.sort(arr);
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}

	}

}
