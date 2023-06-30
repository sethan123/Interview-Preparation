package Interview;

public class Sum_of_digit {
    public static void main(String[] args) {
        int n= 1223345556;
        int sum =0;
        while(n!=0)
        {
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
    
    
    
    
}
