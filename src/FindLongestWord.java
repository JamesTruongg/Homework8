import java.util.Scanner;

public class FindLongestWord {
    public static String findLongestWord(String str) {
        String[] words = SplitWords.splitWords(str);
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();
    }
}
