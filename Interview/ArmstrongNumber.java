package Interview;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num=153;
		int copy =num;
		
		int sum=0;
		
		while(num>0) {
			
			int t = num%10;
			sum =sum +(t*t*t);
			
			num =num/10;		
		}
		
		
		if(sum ==copy)
		{
			System.out.println("It is armstrong");
			
		}
		else {
			System.out.println("It is not a armstrong");
		}
		

	}

}
