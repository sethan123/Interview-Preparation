package Hcl_Training_Loops;

//Java Program to Print * in below Triangular Pattern
//* 
//* * 
//* * * 
//* * * * 
//* * * * * 
//* * * * * *



public class traingle {

	public static void main(String[] args) {
		int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

 

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
    }}

	}

