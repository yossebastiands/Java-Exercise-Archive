/*
The program is about a simple usage of Arrays in Java.

What it does: declaring an array, initializing memory, assigning values, and displaying the array using foreach loops

*/

public class IntroductionToArray_ver_01 {
    public static void main(String[] args) {
        
		// Step 1: Declare an array for integers as a local variable
        int[] numbers;

        // Step 2: Allocate memory for 100 integers
        numbers = new int[100];

        // Step 3: Display the array using a foreach loop before assigning values
        System.out.println("Array values before initialization:");
        for (int num : numbers) {
            System.out.print(num + " "); // Default values will be 0
        }
        
		System.out.println(); // Newline for better formatting

        // Step 4: Use a for loop to assign values from 1 to 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        // Step 5: Display the array using a foreach loop after assigning values
        System.out.println("Array values after initialization:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println(); // Newline for better formatting
    }
}
