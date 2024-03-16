package Arrays_Interview;

public class LargestStringFromTheArray {
    public static void main(String[] args) {
        String arraystring[] = {"apple", "banana", "orange", "kiwi", "strawberry"};
        String largestString1 = findlargestString(arraystring);
        if (largestString1 != null) {
            System.out.println("The largest string is: " + largestString1);
        } else {
            System.out.println("The array is empty or null");
        }
    }
    public static String findlargestString(String[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        String largestString = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > largestString.length()) {
                largestString = array[i];
            }
        }
        return largestString;
    }
}