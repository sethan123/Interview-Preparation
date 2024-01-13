//Given, N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.
//
//Let's take another number 10.
//
//Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. Hence 10 is not a sunny number.
//
//Steps to Find Sunny Number
//The logic is very simple. To find the sunny number, we need only to check whether N+1 is the perfect square or not.
//
//Read or initialize a number (num).
//Add 1 to the given number i.e. num+1.
//Find the square root of num+1.
//If the square root is an integer, the given number is sunny, else not a sunny number.
package Java_Numbers;

public class SunnyNumberExample1 {

	public static void main(String[] args) {

		int num=80;
		int pn=num+1;
		int sqrt=(int) Math.sqrt(pn);
	
		//int squareRoot = (int) Math.floor(sqrt);
		
		if(sqrt*sqrt==pn)
		{
			System.out.println("It is Sunny Number");
		}else
		{
			System.out.println("It is Not Sunny Number");
		}

	}

}
