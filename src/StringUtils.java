import java.util.Scanner;

public class StringUtils {
    public static boolean isPalindrome(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The string " + input + " is a palindrome.");
        } else {
            System.out.println("The string " + input + " is not a palindrome.");
        }
    }
}
