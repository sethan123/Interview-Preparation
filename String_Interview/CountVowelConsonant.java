package String_Interview;

public class CountVowelConsonant {

	public static void main(String[] args) {
		
		
		 String string ="chethan";
		 
		 int vcount=0;
		 int ccount=0;
		 
		 
		 for(int i=0;i<string.length();i++)
		 {
			 if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
			 {
			 vcount++;
			 }else {
				 ccount++;
			 }
			 
		 }
		 
		 System.out.println("vocunt" + vcount);
		 System.out.println("ccocunt" +ccount);
	}

}
