//## Q. Write a java program to swap two string variables without using temp variable?
//**Approach**  
//
//1. Append second string to first string and store in first string:
//   a = a + b
//
//2. call the method substring(int beginindex, int endindex)
//   by passing beginindex as 0 and endindex as,
//      a.length() - b.length():
//   b = substring(0,a.length()-b.length());
//
//3. call the method substring(int beginindex) by passing 
//   b.length() as argument to store the value of initial 
//   b string in a
//   a = substring(b.length());
//
//```java

package String_Interview;

public class Swap_String {

	public static void main(String[] args) {
		String a = "chethan";
		String b="model";
		
		
		
		a=a+b;//chethanmodel
		
		b = a.substring(0, a.length() - b.length());//chethan 
			
			// store initial string b in string a 
			a = a.substring(b.length()); 
		
		System.out.println(a +  b); 
		
	
	}

}
