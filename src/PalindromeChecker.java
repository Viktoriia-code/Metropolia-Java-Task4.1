import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Initialize scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user and read the input string
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Transform the input by converting it to lowercase and removing punctuation
        String transformed = transformInput(input);

        // Check if the transformed string is a palindrome
        boolean isPalindrome = checkPalindrome(transformed);

        // Output the result to the user
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }


    public static String transformInput(String input) {
        // Convert the string to lowercase
        input = input.toLowerCase();

        // Remove commas and exclamation marks for uniformity
        input = input.replace(",", "");
        input = input.replace("!", "");

        return input;
    }

    public static boolean checkPalindrome(String input) {
        // Reverse the input string and compare it with the original input
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        // Use StringBuilder for efficient string manipulation
        StringBuilder reversed = new StringBuilder();

        // Append characters from the end to the start of the input string
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        // Convert StringBuilder to String and return
        return reversed.toString();
    }
}
