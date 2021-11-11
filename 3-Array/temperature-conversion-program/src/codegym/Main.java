package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = importInput();
        switch (choice) {
            case 1:
                fahrenheitToCelsius();
                break;
            case 2:
                celsiusToFahrenheit();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }

    //    Hàm nhận yêu cầu đầu vào từ người dùng.
    public static int importInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }
// C to F
    private static void celsiusToFahrenheit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius: ");
        double C = input.nextDouble();
        double F = C / 5 * 9 + 32;
//        String.format("Celsius to Fahrenheit: %.2f",F);
        System.out.printf("Celsius to Fahrenheit: %.2f",F);
    }
//F to C
    private static void fahrenheitToCelsius() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        double F = input.nextDouble();
        double C = (F - 32) * 5 / 9;
        System.out.printf("Fahrenheit to Celsius: %.2f",C);
//        String.format("Fahrenheit to Celsius: %.2f",C);
    }
}
