package Java_Numbers;

public class laderform {

	public static void main(String[] args) {
		
		 int[] numbers = {1, 2, 3, 4};
	        
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println(getSpaces(i) + numbers[i]);
	        }
	    }
	    
	    public static String getSpaces(int count) {
	        StringBuilder spaces = new StringBuilder();
	        for (int i = 0; i < count; i++) {
	            spaces.append("   "); // Three spaces for each level of indentation
	        }
	        return spaces.toString();

	}

}
