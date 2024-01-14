package Arrays_Interview;

import java.util.Arrays;

public class CompareTwoNumbers {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6};
        int arr2[] = {1, 2, 4, 5, 6, 3};

        int len1 = arr1.length;
        int len2 = arr2.length;

        // If lengths are not the same, arrays are not the same
        if (len1 != len2) {
            System.out.println("Arrays are not the same");
        } else {
            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare sorted arrays element by element
            boolean areEqual = true;

            for (int i = 0; i < len1; i++) {
                if (arr1[i] != arr2[i]) {
                    areEqual = false;
                    break;
                }
            }

            // Output the result
            if (areEqual) {
                System.out.println("Arrays are the same");
            } else {
                System.out.println("Arrays are not the same");
            }
        }
    }
}
