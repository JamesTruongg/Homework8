import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        StringBuilder Reverse = new StringBuilder(string);
        System.out.println("Original string: " + string.toString());
        System.out.println("Reverse string: " + Reverse.reverse().toString());
    }
}
