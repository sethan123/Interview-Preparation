package Arrays_Interview;

import java.util.Arrays;

public class Rotate_Left {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,4,6,7,8,9,10};
		
		Arrays.sort(arr);
		
		int n=5;
		
		System.out.println("Print original number");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "," );
		}

		
		for(int i=0;i<n;i++)
		{
			int j, first;
			
			first=arr[0];
			
			for(j=0;j<arr.length-1;j++)
			{ 
				arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first; 
		}
			System.out.println();
			
			System.out.println("Array left rotaation");
			for(int i=0;i<arr.length;i++)
			{
				   System.out.print(arr[i] + " ");  
			}
		}
	}

