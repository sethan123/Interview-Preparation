package Java_Numbers;

import java.util.Scanner;

public class PetersonNumberExample {
	static int[] factorial = new int[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};  
	public static void main(String[] args) {
	
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the number");
		int s=scanner.nextInt();
		
		if(isPeterson(s))
		{
			System.out.println("It is peterson");
		}else
		{
			System.out.println("It is  not peterson");
		}
		
		
		
		
	}

	
	
	static boolean isPeterson(int s)
	{
		int num=s;
		int sum=0;
		
		while(s>0)
		{
			int digit= s%10;
			sum+= factorial[digit];
			s=s/10;
		}
		
		return (sum==num);
	}
}
