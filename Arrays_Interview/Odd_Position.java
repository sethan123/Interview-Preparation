package Arrays_Interview;

public class Odd_Position {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,5,6,9};
		
		for(int i=0;i<=arr.length-1;i=i+2)
		{
			System.out.println(arr[i]);
		}

	}

}
