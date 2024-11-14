import java.util.Scanner;

public class ChangeTypography {
    public static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch);
            }
        }
        return toggled.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        System.out.println("Orignal string: " + string);
        System.out.println("String after changed: " + toggleCase(string));
    }
}
