import java.util.Scanner;

public class CountWords {
    public static int countWords(String str) {
        String[] words = SplitWords.splitWords(str);
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
        System.out.println("Number of words: " + countWords(string));
    }
}
