package Arrays_Interview;

public class Smallest_Element_In_Array {

	public static void main(String[] args) {
		int arr[]= {1,2,3,45,6,7,99};
		
		int small =arr[0];
		
		for(int i =0;i<=arr.length-1 ;i++)
		{
			if(arr[i]<small)
			{
				small =arr[i];
			}
		}
		
		System.out.println("small Number " +  small);
		

	}

}
