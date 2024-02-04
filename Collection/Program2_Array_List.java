package Collection;

import java.util.ArrayList;

public class Program2_Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> s1= new ArrayList<String>();
		s1.add("java");
		s1.add("pyhton");
		s1.add("manual");
		s1.add("sql");

		
		ArrayList<String> s2= new ArrayList<String>();
		s1.add("mani");
		s1.add("jioel");
		
		
		s1.addAll(s2);
		System.out.println(s1);
		
		
		ArrayList<String> clonelist= (ArrayList<String>)s1.clone();
		System.out.println("cloneList is " + clonelist );
		
		System.out.println(s1.contains("java"));
		System.out.println(s1.indexOf("manual"));
		s1.remove(1);
		System.out.println(s1);
		
	}

}
