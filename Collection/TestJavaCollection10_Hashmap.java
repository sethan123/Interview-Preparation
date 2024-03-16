package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;  
public class TestJavaCollection10_Hashmap {

	public static void main(String[] args) {		
		HashMap<Integer, String> hs = new HashMap<>();		
		hs.put(1, "chethan");
		hs.put(2, "monkey");		
		Set set = hs.entrySet();		
		Iterator itr = set.iterator();		
		while(itr.hasNext())		{
			Map.Entry entry = (Map.Entry)itr.next();			
			System.out.println(entry.getKey() + " "+ entry.getKey());
		}

	}

}
