package Arrays_Interview;

public class Duplicate_In_Array {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {1,2,3,4,5,5,4,2};
		
		System.out.println("Print Duplicate");
		
		for(int i =0; i<arr.length;i++)
		{
			for(int j =i+1; j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
