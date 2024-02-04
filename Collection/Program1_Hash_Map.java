package Collection;

import java.util.HashMap;
import java.util.Iterator;

public class Program1_Hash_Map {

	public static void main(String[] args) {
	
		
		HashMap<String, String> hs = new HashMap<>();
		hs.put("India", "Delhi");
		hs.put("Mand", "dsj");
		
		System.out.println(hs.get("India"));
		
		
		
		Iterator<String> it = hs.keySet().iterator();
		while(it.hasNext())
		{
			String key=it.next();
			String value=hs.get(key);
			
			System.out.println("key = " + key + " ," + "Value = " + value );
		}
		
		

	}

}
