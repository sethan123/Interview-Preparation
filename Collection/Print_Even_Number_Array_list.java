package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_Even_Number_Array_list {

	public static void main(String[] args) {
		
		ArrayList<Integer> n = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,6));
		
		 for (Integer number : n) {
	            if (number % 2 == 0) {
	                System.out.println(number);
		

	}
		 }
}
}