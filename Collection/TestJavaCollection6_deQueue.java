package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TestJavaCollection6_deQueue {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}
		
		System.out.println("___________________");
		deque.addLast("chethn");
		
		Iterator it = deque.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}

