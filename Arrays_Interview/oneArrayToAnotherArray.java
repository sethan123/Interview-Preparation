package Arrays_Interview;

public class oneArrayToAnotherArray{
	public static void main(String[] args) {
		int[] arr = new int [] {1, 2, 3, 4, 5};
		int arr1[] = new int [arr.length];
		
		for(int i =0;i<arr.length;i++)
		{
			arr1[i]=arr[i];
		}
		
		 System.out.println("Elements of original array: ");    
	        for (int i = 0; i < arr.length; i++) {     
	           System.out.print(arr[i] + " ");    
	        }     
	            
	       
	            
	        //Displaying elements of array arr2     
	        System.out.println("Elements of new array: ");    
	        for (int i = 0; i < arr1.length; i++) {     
	           System.out.print(arr1[i] + " ");    
		
	        }	
	}
}