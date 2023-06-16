package Hcl_Training_Loops;

import java.util.Scanner;

//Write a Java Program to Calculate Sum & Average of an Array
//Sample input: 
//Enter no. of elements you want in array:5
//Enter all the elements:
//4
//7
//6
//9
//3
//Sample output:
//Sum:29
//Average:5.8

public class sum_and_avg {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter all the elements:");
        // Element you want in array
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        //  sum
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }
        // average
        double average = (double) sum / size;
        //  sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);          
}
}
		
		
		
		
		

