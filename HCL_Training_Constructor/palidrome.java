
//Take input from console and check whether number is palindrome or not.
//- palindrome number is a number that is same after reverse. For example 545, 151

package HCL_Training_Constructor;
import java.util.Scanner;

public class palidrome {

	public static void main(String[] args) {
		//Method 1 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
	    int number = scanner.nextInt();
	    int originalNumber=number;
	    int reversedNumber = 0;
	    
	    while(number!=0)
	    {
	    	reversedNumber = reversedNumber*10 + number%10;
	    	number = number/10;
	    }
	    
	    if(reversedNumber==originalNumber)
	    {
	    	System.out.println(" Is a palindrome number.");
	    } else {
	    	 System.out.println(" Is not a palindrome number.");
		
	    }
		
	
	//Method2
//		Scanner scanner = new Scanner(System.in);
//		 System.out.print("Enter a number: ");
//	        int number = scanner.nextInt();
//	        
//	        StringBuilder sb = new StringBuilder();
//	        sb.append(number);
//	        
//	        String originalNumber = sb.toString();
//	        String reversedNumber = sb.reverse().toString();
//	        
//	        if (originalNumber.equals(reversedNumber)) {
//	            System.out.println(number + " is a palindrome number.");
//	        } else {
//	            System.out.println(number + " is not a palindrome number.");
//	        }
	}

}
