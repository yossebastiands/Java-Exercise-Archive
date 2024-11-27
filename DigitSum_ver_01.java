/*
This program is about finding the digit-sum of a number
Example:
Input is 5423
Output is 3+2+4+5 = 14

In this version, it only prints out the final output without writing the addition.
Check the DigitSum_ver_02.java for the 2nd version to see that the calculation is printed out.

Rules are:
- The input is between -2147483648 to 2147483647
- The input is only positive numbers
*/

// Import the input feature
import java.util.Scanner;

// Determine the class and the main method
public class DigitSum_ver_01 {
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
       
		// Calculate the digit sum
       	int digitSum = calculateDigitSum(myNumber);
       	// Output the result
       	System.out.println("The result of the digit sum of the number "+ myNumber + " is " + digitSum + ".");
	}
    
	// The calculation to sum the digits
    public static int calculateDigitSum(int number) {
       	int sum = 0;
   	    while (number > 0) {
           	sum += number % 10;  // Extract the last digit
           	number /= 10;    	// Remove the last digit
       	}
       	return sum;
    }
}


