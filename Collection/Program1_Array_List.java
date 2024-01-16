package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Program1_Array_List {

	public static void main(String[] args) {

		
		ArrayList<Object> arrayList = new ArrayList<Object>();
			arrayList.add("chethan");
			arrayList.add(100);
			arrayList.add("tarun");
			
		ArrayList<Double> arrayList2 = new ArrayList<Double>();
		arrayList2.add(10.0);
		
			
			
			System.out.println(arrayList.get(2));
			System.out.println(arrayList.get(1));
			System.out.println(arrayList.size());
			
			System.out.println(arrayList2.get(0));
			
			for(int i=0;i<arrayList.size();i++)
			{
				System.out.println(arrayList.get(i));
			}
			
		
			for (Object str : arrayList) {
				
				System.out.println(str);
			}
			
			Iterator<Object> iterator = arrayList.iterator();
			
			while (iterator.hasNext()) {
				
				System.out.println(iterator.next());
				
			}
			
	}

}
