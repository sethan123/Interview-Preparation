package Collection;

import java.util.HashMap;
import java.util.Map;

public class TestJavaCollection10_Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hs = new HashMap<>();		
		hs.put(1, "chethan");
		hs.put(2, "monkey");	
		
		for(Map.Entry m : hs.entrySet())
		{
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
