package Interview;

public class String_Question_2 {

	public static void main(String[] args) {
		
		String s= "My name is gowjd kumar gupta";
		String output="";
		
		//o/p : "gupta kumar gowjd is name my"
		
		
		String word[]= s.split(" ");
		
		for(int i=word.length-1;i>=0;i--)
		{
			
			output =output+" "+word[i];
			
		}
		
		
		System.out.println(output);

	}

}
