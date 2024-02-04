package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class TestJavaCollection1_Arraylist_1 {

	public static void main(String[] args) {


		ArrayList<String> arrayList= new ArrayList<String>();
		
		arrayList.add("chethan");
		arrayList.add("money");
		arrayList.add("mornign");
		
		Iterator iterator =arrayList.iterator();
		
		
		while(iterator.hasNext())
		{
		System.out.println(iterator.next());

	}
	}
}
