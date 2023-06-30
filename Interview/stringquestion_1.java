package Interview;

public class stringquestion_1 {

	public static void main(String[] args) {
		  
		String s ="Boy is good";
		 
		//o/p BIS
		
		
		String word[]=s.split(" ");
		
		for(int i=0; i<word.length; i++)
		{
			System.out.print(word[i].charAt(0));
			
			
		}
		

	}

}
