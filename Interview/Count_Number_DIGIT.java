package Interview;

public class Count_Number_DIGIT {
    public static void main(String[] args) {
        int a =123233424;
        int count =0;

        while (a>0)
        {
            a=a/10;
            count++;

        }
        System.out.println(count);

    }
}
