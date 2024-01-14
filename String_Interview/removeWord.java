package String_Interview;

public class removeWord {

	public static void main(String[] args) {
		
		
		 String str = "CloudTech";	
		 str=str.toLowerCase();	
		 char ch='c';	
		 
		 removeChar(str,ch);
		 
		    	    
		   
		    }
		    
		       public static void removeChar(String str, char c)
		    {
		        String finalstr ="" ;
		        for(int i =0;i<str.length();i++)
		        {
		            if(str.charAt(i) != c)
		            {
		                finalstr =finalstr + str.charAt(i);
		            }
		             
		        }
		        
		        System.out.println(finalstr);   
		       
		        
		        
	}

}
