package String_Interview;

public class Palidrome_String {
    public static void main(String[] args) {
//        String str="chethan";
//        StringBuffer sb =new StringBuffer(String.valueOf(str));
//        StringBuffer rev =sb.reverse();
//        String str1 = sb.toString();
//        if(str.equals(str1)){
//            System.out.println("pallidrome");
//    }
//        else {
//        System.out.println("notapallidrome");
//    }
//    }
    	
    	
    	StringBuffer s=new StringBuffer("chethan");
    	
    	StringBuffer revString=  s.reverse();
    String s1=	revString.toString();
    	
    	
    if(s1.equals(s))
    {
    	System.out.println("it is palidrome");
    }else {
    	System.out.println("it is not palidrome");
    	
	}
    
    
    
    
    }  
}
