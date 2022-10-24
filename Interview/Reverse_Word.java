package Interview;

public class Reverse_Word {
    public static void main(String[] args) {
        String s ="chethan";

        StringBuilder reverseString = new StringBuilder();

        String[] words = s.split(" ");   //step 1

        for (String word : words)
        {
            String reverseWord = new StringBuilder(word).reverse().toString();    //step 2
            reverseString.append(reverseWord + " ");                //step 3
        }

        System.out.println( reverseString.toString().trim() );    //verify reversed string

    }
}
