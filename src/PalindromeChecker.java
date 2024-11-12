import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String firstInput = scanner.nextLine();
        String changedInput = transformInput(firstInput);

        boolean isPalindrome = isPalindrome(changedInput);
        if (isPalindrome) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
        scanner.close();
    }

// change the input to lowercase and removing the "," and "!"
    public static String transformInput(String input) {
        input = input.toLowerCase();
        input = input.replace(",", "").replace("!", "");
        return input;
    }

// check if the string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // reverse the string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}