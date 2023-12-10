package Arrays_Interview;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Array_Using_Collection {

	public static void main(String[] args) {
		
		
		int a[] = {5,2,6,8,6,7,5,2,8};
	     
        // Function call
        removeDuplicates(a);
	}

	
	public static void removeDuplicates(int[] a ) {
		
		LinkedHashSet<Integer> s = new LinkedHashSet<>();
	
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
			
		}
		System.out.println(s);
	}
}


