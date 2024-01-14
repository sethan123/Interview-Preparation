package String_Interview;

public class Palidrome_String1 {

	public static void main(String[] args) {
		
		
		String string = "liril";
		
		boolean flag = true;
		
		
		string=string.toLowerCase();
		
		for(int i=0;i<string.length()/2;i++)
		{
			
			if(string.charAt(i)!= string.charAt(string.length()-i-1))
			{
				flag =false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("It is palidrome");
		}else {
			System.out.println("It is not a palidrome");
		}
		
	}

}
