package Java_Matrix;
import java.util.Arrays;

public class MatrixEquality {

    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        if (areMatricesEqual(matrix1, matrix2)) {
            System.out.println("Matrices are equal.");
        } else {
            System.out.println("Matrices are not equal.");
        }
    }

    // Function to check equality of two matrices
    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            return false; // Matrices have different dimensions
        }

        for (int i = 0; i < matrix1.length; i++) {
            if (!Arrays.equals(matrix1[i], matrix2[i])) {
                return false; // Rows are not equal
            }
        }

        return true; // Matrices are equal
    }
}
