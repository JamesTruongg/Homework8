import java.util.Scanner;

public class RemoveExtraSpaces {
    public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("String with extra spaces removed: " + removeExtraSpaces(string));

    }
}
