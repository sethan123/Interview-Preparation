package Interview;

public class split_the_string_and_number {

	
	
	public void splitString() {
		String sentence = "Hello, how are you?";
		String[] words = sentence.split(" ");
		for (String word : words) {
		    System.out.println("split the word:" + word);
		    System.out.print("");
		}		
	}
	
	public void splitNumber() {
		String numbers = "1,2,3,4,5";
		String[] numberArray = numbers.split(",");
		for (String number : numberArray) {
		    System.out.println("split the number" + number);
		}

	}
		
		public static void main(String[] args) {
			
			split_the_string_and_number ss= new split_the_string_and_number();
			ss.splitString();
			ss.splitNumber();
			
			

		

	}

}
