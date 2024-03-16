package Collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class TestJavaCollection10_Hashmap1_comparingkey_DescendingOrder {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      
	      
	      map.entrySet()
	      .stream()
	      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	      .forEach(System.out::println);
	      
	      
	      System.out.println("---------------------------");
	      
	      map.entrySet()
	      .stream()
	      .sorted(Map.Entry.comparingByValue())
	      .forEach(System.out::println);
	}
	
	
	

}
