//A number is called an automorphic number if and only if the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776, respectively and the last two digits of the square represent the number itself. Some other automorphic numbers are 5, 6, 36, 890625, etc.
//
//Read a number (num) from the user.
//Find the square of the given number and store it in a variable (square).
//Find the last digit(s) of the square.
//Compare the last digit(s) of the variable with num.
//If they are not equal, the given number is not an automorphic number.
//If they are the same, go to the next step.
//Remove the last digit of the given number i.e. num.
//Repeat steps 4 to 6 until the given number becomes 0.

package Java_Numbers;

import java.util.Scanner;

public class AutomorphicNumberExample1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int s = sc.nextInt();
		
		int count =0;
		int sqrt =s *s;
		
		int temp =s;
		
		while(temp >0)
		{
			count++;
			temp = temp/10;
		}
		
		int lastDigit = (int) (sqrt%(Math.pow(10, count)));   
		//compare num with last digit of the variable square  
		if(s == lastDigit)  
		System.out.println(s+ " is an automorphic number.");  
		else  
		System.out.println(s+ " is not an automorphic number.");  

	}

}
