//Calculate A = n (n+1)/2 where n is largest number in series 1…N.
//Calculate B = Sum of all numbers in given series
//Missing number = A – B

package Interview;

public class Missing_Number_Array{
public static void main(String[] args) {
	 
		   	int total;
		   	int[] num = new int[] {1, 2, 3, 4, 6, 7};
		   	 total =7;
		   	 
		   	 int expected_sum = total*((total+1)/2);
		   	int num_sum = 0;
			
			for (int i: num) {
			 num_sum += i;
			}
			
			System.out.print( expected_sum - num_sum );
		   	
		   	
		   
		
	}	
		
		
		

	}
