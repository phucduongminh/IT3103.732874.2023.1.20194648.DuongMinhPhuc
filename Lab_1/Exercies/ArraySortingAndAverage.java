import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Initialize an array of size n
        double[] numbers = new double[n];
        
        // Prompt the user to enter the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Calculate the sum of array elements
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        // Calculate the average value
        double average = sum / n;
        
        // Display the sorted array
        System.out.println("Sorted Array:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nSum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);
        
        scanner.close();
    }
}
