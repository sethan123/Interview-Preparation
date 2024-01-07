package String_Interview;

public class String_Practise {

	public static void main(String[] args) {
		String s="chethan";
		System.out.println(s.toUpperCase());  //o/p  --> CHETHAN
		System.out.println(s);  // o/p -->  chethan   --> This is the simple example of string immutable 

		
		
// To overcome the above issue 		
//StringBuffer and Builder are mutable 
		StringBuffer sb=new StringBuffer(s);
		sb.append("cjeyhs");
		System.out.println(sb); // o/p-->    chethancjeyhs
		System.out.println(sb); // o/p-->  chethancjeyhs

	}

}
