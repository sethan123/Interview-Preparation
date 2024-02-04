package String_Interview;
//aaaabbbccc"
		 //o/p-a4b3c3

public class test1 {	
	
			    public static String compressString(String input) {
			        StringBuilder compressed = new StringBuilder();

			        int count = 1;
			        for (int i = 1; i < input.length(); i++) {
			            if (input.charAt(i) == input.charAt(i - 1)) {
			                count++;
			            } else {
			                compressed.append(input.charAt(i - 1));
			                compressed.append(count);
			                count = 1;
			            }
			        }

			        // Append the last character and its count
			        compressed.append(input.charAt(input.length() - 1));
			        compressed.append(count);

			        return compressed.toString();
			    }

			    public static void main(String[] args) {
			        String inputString = "aaabbccdaa";
			        String compressedString = compressString(inputString);

			        System.out.println("Original String: " + inputString);
			        System.out.println("Compressed String: " + compressedString);
			    }
}
		 
		 
		 
		 
	
	 
	 
	
		 
		 
		
	