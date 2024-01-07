package String_Interview;

public class SplitString {
    public static void main(String[] args) {
        String s= "Scalerby Interview Bit";
        String[] s1=  s.split(" ");


        for (String word:s1) {
            System.out.println(word);

        }
    }
}
