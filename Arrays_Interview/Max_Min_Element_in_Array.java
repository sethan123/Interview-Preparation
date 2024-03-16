package Arrays_Interview;

import java.util.Arrays;

public class Max_Min_Element_in_Array {
//  Approch 1
//    class Max_Min_Element_in_Array {
//        static int getMin(int arr[], int n) {
//            return Arrays.stream(arr).min().getAsInt();
//        }
//
//        static int getMax(int arr[], int n) {
//            return Arrays.stream(arr).max().getAsInt();
//        }
//
//        public static void main(String[] args) {
//            int[] a = {1, 2, 3, 4, 5, 6};
//            int n = a.length;
//            System.out.println("Minimum element of array: " + getMin(a, n));
//            System.out.println("Maximum element of array: " + getMax(a, n));
//
            //Approch 2

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 6};

//        int max = IntStream.range(0, A.length)
//                .map(i -> A[i])
//                .max()
//                .getAsInt();
//
//        int min = IntStream.range(0, A.length)
//                .map(i -> A[i])
//                .min()
//                .getAsInt();
//
//        System.out.println("Min element is " + min);
//        System.out.println("Max element is " + max);
//    }

        Arrays.sort(A);
        System.out.println("Min element is " + A[0]);
        System.out.println("Min element is " + A[A.length-1]);


    }

        }

