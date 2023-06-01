package Interview;

public class Palidrome_Number {
    public static void main(String[] args) {
        int a=131;

        int org =a;
        int rev=0;
        while(a!=0)
        {
            rev=rev*10 + a%10;
            a=a/10;
        }
        if(org==rev){
            System.out.println("pallidrome");
        }
        else {
            System.out.println("notapallidrome");
        }
    }
}
