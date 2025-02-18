import java.util.Scanner;
import java.util.Random;

public class Assignment1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Print initials in block letters
        printInitials();

        // Step 2: Ask the user to input a Fahrenheit temperature and convert it to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        int fahrenheit = scanner.nextInt();
        int celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + celsius);

        // Step 3: Ask the user to input a 5-character string and reverse it excluding first and last characters
        System.out.print("Enter a 5-character string: ");
        scanner.nextLine();  // Clear the buffer
        String inputString = scanner.nextLine();
        String modifiedString = inputString.substring(1, inputString.length() - 1);
        System.out.println("Modified String: " + modifiedString);

        // Step 4: Generate a random number between 32 and 16,384 (inclusive)
        Random rand = new Random();
        int randomNum = rand.nextInt(16384 - 32 + 1) + 32;
        System.out.println("Random Number: " + randomNum);

        // Final step: Print all results
        System.out.println("\nFinal Output:");
        System.out.println("Celsius: " + celsius);
        System.out.println("Modified String: " + modifiedString);
        System.out.println("Random Number: " + randomNum);

        scanner.close();
    }
    // Method to print initials in block letters
    public static void printInitials() {
        String initials = "JB";  // Example initials (First = A, Last = B)

        // Letter 'JB' block print
        System.out.println("  JJJJJJJJ  BBBBBB ");
        System.out.println("      J     B     B");
        System.out.println("      J     BBBBBB ");
        System.out.println("      J     B     B");
        System.out.println("  JJJJJ     BBBBBB ");
    }
}
