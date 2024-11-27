/*
This program is about finding the digit-sum of a number
Example:
Input is 5423
Output is "3+2+4+5 = 14"
Notice that the output must include the calculation of each digit.
To do this, each digit must be stored in a list (or reverse a string), and then print them before summing.

Rules are:
- The input is between -2147483648 to 2147483647
- The input is only positive numbers
*/

// Import the input feature
import java.util.Scanner;

// Determine the class and the main method
public class DigitSum_ver_02 {
	public static void main(String[] args) {
		
		// Declare the input feature
        Scanner sc = new Scanner(System.in);
		
		// Asking for input
       	System.out.println("Input a natural number (maximal 2147483647):");
		// Assigning the input
     	int myNumber = sc.nextInt();
   		
		// Check if the input is positive		
       	if (myNumber < 0) {
           	System.out.println("False Input. Only positive numbers are allowed.");
           	return;
       	}
       
        // Calculate and display the digit sum with individual digits
        System.out.print("The digit sum of the number " + myNumber + " is: ");
        printDigitSumWithSteps(myNumber);
	}
    
    // The calculation and printing to show each digit
		public static void printDigitSumWithSteps(int number) {
        int sum = 0;
        StringBuilder output = new StringBuilder();
        
        while (number > 0) {
            int digit = number % 10;  // Extract the last digit
            sum += digit;            // Add the digit to the sum
            output.insert(0, digit); // Prepend digit to output (reversing the order)
            if (number >= 10) {
                output.insert(0, "+"); // Add '+' before each digit except the last
            }
            number /= 10;            // Remove the last digit
        }
        
        // Print the constructed string and the sum
        System.out.println(output + " = " + sum);
    }

}
    
