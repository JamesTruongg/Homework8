import java.util.Scanner;

public class SplitWords {
    public static String[] splitWords(String str) {
        return str.trim().split("\\s+");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Split words: ");
        for (String word : splitWords(string)) {
            System.out.println(word);
        }
    }
}
