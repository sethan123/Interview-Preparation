package Hcl_Training_Loops;

import java.util.Arrays;


//Write a Java Program to Merge Two Arrays in Order
//Example:
//Array1: [1,2,3,4,5]
//Array2: [2,3,6,7,8]
//
// 
//
//Output:
//Array = [1,2,2,3,3,4,5,6,7,8]

public class merge_two_array {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 3, 6, 7, 8};     



        // Calculate the length 
        int mergedLength = array1.length + array2.length;
        int[] mergedArray = new int[mergedLength];
             int i = 0, j = 0, k = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }



           while (i < array1.length) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }




        System.out.println("Merged Array: " + Arrays.toString(mergedArray));

	}

}
