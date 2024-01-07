package String_Interview;

public class Generate_Ramdom_Value_in_random_class {

	public static void main(String[] args) {
		int min =1;
		int max=100;
		
		double a = Math.random()* (max-min+1) + min;
		
		System.out.println(a);
		
		
		System.out.println(Math.random());

	}

}
