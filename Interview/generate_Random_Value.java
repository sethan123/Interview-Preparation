package Interview;

import java.util.concurrent.ThreadLocalRandom;	

public class generate_Random_Value {

	public static int getRandom(int min, int max)
	{
		return ThreadLocalRandom.current().nextInt(min,max+1);
		
		
	}
	
	public static void main(String args[])
	{
		int min=0;
		int max=100;
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(getRandom(min, max));
	}
	
	
}
