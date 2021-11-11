package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        int gcf = findGreatestCommonFactor(number1,number2);

        System.out.printf("Greatest common factor of %d and %d is %d!",number1,number2,gcf);

    }

    private static int findGreatestCommonFactor(int number1, int number2) {
        while (number1 != number2) {
            if (number1 > number2) {
                number1 -= number2;
            } else {
                number2 -= number1;
            }
        }
        return number1;

//        if (number1 > number2) {
//            number1 -= number2;
//        } else if (number1 < number2) {
//            number2 -= number1;
//        }
//
//        if (number1 == number2) {
//            return number1;
//        } else {
//            findGreatestCommonFactor(number1, number2);
//        }
//        return number1;
    }
}
