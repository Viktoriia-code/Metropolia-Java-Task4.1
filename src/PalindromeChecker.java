import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String cleanedInput = cleanInput(userInput);

      
        if (isPalindrome(cleanedInput)) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
        scanner.close();
    }



// change the input to lowercase and removing the "," and "!"   
  public static String cleanInput(String input) {
        String lowerCaseInput = input.toLowerCase();
        lowerCaseInput = lowerCaseInput.replace(",", "");
        lowerCaseInput = lowerCaseInput.replace("!", "");
        return lowerCaseInput;
    }
// check if the string is a palindrome
    public static boolean isPalindrome(String input) {
        String reversedInput = reverseString(input);
        return input.equals(reversedInput);

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