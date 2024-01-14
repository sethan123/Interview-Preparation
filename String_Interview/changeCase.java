package String_Interview;

public class changeCase {

	public static void main(String[] args) {
		
		String s ="Great Power";
		
		StringBuffer stringBuffer=new StringBuffer(s);
		
		for(int i=0;i<s.length();i++)
		{
			
			if(Character.isLowerCase(s.charAt(i)))
			{
				stringBuffer.setCharAt(i, Character.toUpperCase(s.charAt(i)));
			}
			else if (Character.isUpperCase(s.charAt(i))) {
				{
					stringBuffer.setCharAt(i, Character.toLowerCase(s.charAt(i)));
				}
				
			}
			
			
		}
		
		System.out.println(stringBuffer);
	}

}
