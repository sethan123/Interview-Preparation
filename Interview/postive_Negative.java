package Interview;

import java.util.Scanner;

public class postive_Negative {

	public static void main(String[] args) {
		
		
		int n1;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number: ");  
		n1 =scanner.nextInt();
		
		
		if(n1>0)
		{
			System.out.println("It is positive");
		}else if (n1<0) {
			System.out.println("It is negative");
		}else {
			System.out.println("it is zero");
		}

	}

}
