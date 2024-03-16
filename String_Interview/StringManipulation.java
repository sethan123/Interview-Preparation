package String_Interview;

public class StringManipulation {
    
    	public static void main(String[] args) {
            String s = "Capgemini";
            String reversed = reverseString(s);
            System.out.println("Reversed String: " + reversed);
        }
        
        public static String reverseString(String str) {
            StringBuilder reversed = new StringBuilder();
            for (int i = str.length() - 1; i >= 0; i--) {
                reversed.append(str.charAt(i));
            }
            return reversed.toString();
        }
    }
    
