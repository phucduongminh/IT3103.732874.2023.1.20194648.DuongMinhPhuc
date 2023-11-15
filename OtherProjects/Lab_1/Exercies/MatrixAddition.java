import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Create two matrices of the same size
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];

        // Input for the first matrix
        System.out.println("Enter elements of the first matrix:");
        inputMatrix(matrix1, scanner);

        // Input for the second matrix
        System.out.println("Enter elements of the second matrix:");
        inputMatrix(matrix2, scanner);

        // Add the matrices and store the result in a new matrix
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Sum of the matrices:");
        displayMatrix(sumMatrix);

        scanner.close();
    }

    // Function to input elements into a matrix
    public static void inputMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Function to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] sumMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return sumMatrix;
    }

    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
