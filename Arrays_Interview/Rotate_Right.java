package Arrays_Interview;

import java.util.Arrays;

public class Rotate_Right {

	public static void main(String[] args) {
		
		
int arr[] = {1,2,3,5,4,6,7,8,9,10};
		
		Arrays.sort(arr);
		
		int n=5;
		
		System.out.println("Print original number");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "," );
		}

		
		
		for(int i=0;i<n;i++) {
			int j,last;
			
			 last = arr[arr.length-1];    
			for(j = arr.length-1; j > 0; j--){    
                    
                arr[j] = arr[j-1];    
            }    
               
            arr[0] = last;    
        }    
        
        System.out.println();    
            
           
        System.out.println("Array after right rotation: ");    
        for(int i = 0; i< arr.length; i++){    
            System.out.print(arr[i] + " ");  
			
			
			
		}

	}

}
