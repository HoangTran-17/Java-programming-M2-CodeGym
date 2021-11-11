package codegym;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {

    public static String readOneToNine(int x){
        String result = "one";
        switch (x) {
            case 1:
                break;
            case 2:
                result = "two";
                break;
            case 3:
                result = "Three";
                break;
            case 4:
                result = "four";
                break;
            case 5:
                result = "five";
                break;
            case 6:
                result = "six";
                break;
            case 7:
                result = "seven";
                break;
            case 8:
                result = "eight";
                break;
            case 9:
                result = "nine";
                break;
            default:
                result = "";
                break;
        }
        return result;
    }

    public static String readTenToNineteen(int x){
        String result = "ten";
        switch (x) {
            case 10:
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
            case 16:
                result = "sixteen";
                break;
            case 17:
                result = "seventeen";
                break;
            case 18:
                result = "eighteen";
                break;
            case 19:
                result = "nineteen";
                break;
        }
        return result;
    }

    public static String readTwentyToNinety(int x){
        String result = "ten";
        switch (x) {
            case 10:
                break;
            case 20:
                result = "twenty";
                break;
            case 30:
                result = "Thirty";
                break;
            case 40:
                result = "forty";
                break;
            case 50:
                result = "fifty";
                break;
            case 60:
                result = "sixty";
                break;
            case 7:
                result = "seventy";
                break;
            case 80:
                result = "eighty";
                break;
            case 90:
                result = "ninety";
                break;
        }
        return result;
    }

    public static String readHundreds(int number){
        String result = "";
        int integerPart = number / 100;
        if (integerPart > 0) {
            result += String.format("%s hundred", readOneToNine(integerPart));
        }
        int residuals = number % 100;
        if (residuals >= 20) {
            int evenPartOfResiduals = residuals - (residuals % 10);
            result += String.format(" %s",readTwentyToNinety(evenPartOfResiduals));
        }
        if (residuals >= 10 && residuals < 20) {
            result += String.format(" %s",readTenToNineteen(residuals));
        } else {
            result += String.format(" %s",readOneToNine(residuals % 10));
        }
        return result;
    }
    public static void display(int number,String result){
        System.out.printf("Number %d read into \"%s\"",number,result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        String result = "";
        if (number == 0) {
            result += "Zero";
        } else if (number < 0) {
            result += "Negative ";
            number = 0 - number;
        }
        if (number < 1000) {
            result += readHundreds(number);
        } else if (number < 1000000) {
            int perThousand = number / 1000;
            result += String.format("%s thousand %s",readHundreds(perThousand),readHundreds(number % 1000));
        }
        display(number,result);
    }
}
