package Hcl_Training_Loops;

import java.util.Scanner;

//Java program to find entered alphabet is vowel or Consonant
//
//
//
//Sample input: 
//Input an alphabet: p
//
// 
//
//Sample output:
//Input letter is Consonant

public class Vowel_or_Consonant {

	public static void main(String[] args) {
		  
			    Scanner scanner = new Scanner(System.in);
			        System.out.print("Input an alphabet: ");
			        char alphabet = scanner.next().charAt(0);        
			        alphabet = Character.toLowerCase(alphabet);

			 

			        if (alphabet >= 'a' && alphabet <= 'z') {

			            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
			                System.out.println("Input letter is a Vowel");
			            } else {
			                System.out.println("Input letter is a Consonant");
			            }
			        } else {
			            System.out.println("Invalid input. Please enter an alphabet.");
			        }

			 

			    }
	}
	