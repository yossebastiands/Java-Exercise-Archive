/*
The program is about using two-dimensional array to store first and last names. 
The program should:
- Read the number of name pairs.
- Allow input of first and last names.
- Display names using both for and foreach loops.

§ INPUT §
Enter the number of name pairs:
2
Enter first name for pair 1:
John
Enter last name for pair 1:
Doe
Enter first name for pair 2:
Jane
Enter last name for pair 2:
Smith

§ OUTPUT §
Displaying names using for-loop:
Name Pair 1: John Doe
Name Pair 2: Jane Smith

Displaying names using foreach-loop:
Name Pair 1: John Doe
Name Pair 2: Jane Smith


*/

import java.util.Scanner;

public class TwoDimensionalArraysOfNames_ver_01 {
	
    public static void main(String[] args) {
        // Testdriver: Setting up the main program
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Ask for the number of name pairs
        System.out.println("Enter the number of name pairs:");
        int namePairs = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Step 2: Declare a 2D array to store names
        String[][] names = new String[namePairs][2];
        
        // Step 3: Read names using a method
        readNames(scanner, names);
        
        // Step 4: Display names using a for-loop
        System.out.println("\nDisplaying names using for-loop:");
        displayNamesWithForLoop(names);
        
        // Step 5: Display names using a foreach-loop
        System.out.println("\nDisplaying names using foreach-loop:");
        displayNamesWithForeachLoop(names);
        
        scanner.close();
    }
    
    // Method to read names into the 2D array
    public static void readNames(Scanner scanner, String[][] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter first name for pair " + (i + 1) + ":");
            names[i][0] = scanner.nextLine();
            System.out.println("Enter last name for pair " + (i + 1) + ":");
            names[i][1] = scanner.nextLine();
        }
    }
    
    // Method to display names using a for-loop
    public static void displayNamesWithForLoop(String[][] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name Pair " + (i + 1) + ": " + names[i][0] + " " + names[i][1]);
        }
    }
    
    // Method to display names using a foreach-loop
    public static void displayNamesWithForeachLoop(String[][] names) {
        int count = 1;
        for (String[] pair : names) {
            System.out.println("Name Pair " + count + ": " + pair[0] + " " + pair[1]);
            count++;
        }
    }
}
