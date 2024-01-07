package Java_Numbers;

public class Factorial_Number {
    public static void main(String[] args) {
        int n=10;
        int sum=1;
        while(n>0)
        {
            sum =sum*n;
            n--;
        }
        System.out.println("Factorial Number is" + sum);
    }
}
