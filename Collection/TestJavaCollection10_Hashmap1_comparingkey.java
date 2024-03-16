package Collection;

import java.util.HashMap;
import java.util.Map;

public class TestJavaCollection10_Hashmap1_comparingkey {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"Amit");    
	      map.put(101,"Vijay");    
	      map.put(102,"Rahul");   
	      
	      map.entrySet()
	      .stream()
	      .sorted(Map.Entry.comparingByKey())
	      .forEach(System.out::println);
	      

	}

}
