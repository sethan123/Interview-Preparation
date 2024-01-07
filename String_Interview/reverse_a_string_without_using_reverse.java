package String_Interview;

public class reverse_a_string_without_using_reverse {
    public static void main(String[] args) {
        String str = "This Is String.";
        String revstring = "";

        for (int i = str.length() - 1; i >= 0; --i) {
//Start getting characters from end of the string.

            revstring += str.charAt(i);

        }

        System.out.println(revstring);


    }
}



