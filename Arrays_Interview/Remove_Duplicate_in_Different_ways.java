package Arrays_Interview;

import java.util.Arrays;

public class Remove_Duplicate_in_Different_ways {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,34,4,3,2,3,4,5,4,3,2,2};
		
		Arrays.sort(arr);
		
		int len=arr.length;
		
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				arr[j+1]=arr[i];
			}
		}
		arr[j++]=arr[len-1];
		
		for(int k=0;k<j;k++)
		{
			System.out.println(arr[k]);
		}

	}

}
