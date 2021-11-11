package codegym;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String string = importString();
        char character = importChar();

        countCharInString(string, character);
    }

    private static String importString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = input.nextLine();
        return string;
    }

    private static char importChar() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char character = input.next().charAt(0);
        return character;
    }

    private static void countCharInString(String string, char character) {
        int count = 0;
        String str = string.toLowerCase(Locale.ROOT);
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                ++count;
            }
        }
        System.out.printf("Count char '%s' in string '%s' is: %d",character,string,count);
    }
}