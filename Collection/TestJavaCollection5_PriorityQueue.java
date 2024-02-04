package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestJavaCollection5_PriorityQueue {

	public static void main(String[] args) {
		
		
		PriorityQueue<String> priorityQueue= new PriorityQueue<>();
		
		priorityQueue.add("cheth");
		priorityQueue.add("cdj");
		priorityQueue.add("JaiShankar");  
		priorityQueue.add("Raj");  
		System.out.println(priorityQueue.element());
		System.out.println(priorityQueue.peek());

		Iterator itr=priorityQueue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		priorityQueue.remove();  
		priorityQueue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=priorityQueue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
	}
	}
}
