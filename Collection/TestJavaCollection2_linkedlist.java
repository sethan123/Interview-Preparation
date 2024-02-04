package Collection;

import java.util.Iterator;
import java.util.LinkedList;

public class TestJavaCollection2_linkedlist {

	public static void main(String[] args) {
		
		
		LinkedList<String> l = new LinkedList<>();
		
		
		l.add("chethan");
		l.add("money");
		
		
		Iterator it = l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
