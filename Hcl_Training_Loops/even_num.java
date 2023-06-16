package Hcl_Training_Loops;

import java.util.Scanner;

//write a Java Program to print even numbers in array using for-each loop
//Sample input: 
//Enter no. of elements you want in array:5
//Enter all the elements:
//4
//7
//6
//9
//3
//
// 
//
//Sample output:
//Even numbers: 4 6

public class even_num {
	

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Even numbers: ");

 

        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }           

	}

}
