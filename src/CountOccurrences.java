import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();
        System.out.println("String:" + string);
        System.out.println("Enter a character counted: ");
        String CharactersCounted = sc.next();
        char Character = CharactersCounted.charAt(0);
        int Count = 0;
        for(int i = 0; i <string.length();i++){
            if(  string.charAt(i) == Character){
                    Count++;
            }
        }
        System.out.println( "Character " + Character + " appear " + Count + " times");
    }
}
