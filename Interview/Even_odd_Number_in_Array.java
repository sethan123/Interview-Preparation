package Interview;

import java.util.Scanner;

public class Even_odd_Number_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();


            if (n % 2 == 0) {
                System.out.println("Entered Number is Even Number");

            } else {
                System.out.println("Entered Number is Odd Number");
            }
        }
    }
