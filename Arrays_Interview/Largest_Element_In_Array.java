package Arrays_Interview;

public class Largest_Element_In_Array {

	public static void main(String[] args) {
	
		int arr[] = {1,2,3,4,5,6,7};
		
		
		int large=arr[0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large =arr[i];
			
			}
			
		}
		System.out.println("Largest Element "+  large);

	}

}
