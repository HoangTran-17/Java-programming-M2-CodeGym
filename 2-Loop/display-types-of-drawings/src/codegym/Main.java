package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = importInput();
        switch (choice) {
            case 1:
                drawTheRectangle();
                break;
            case 2:
                drawTheIsoscelesRightAngledTriangle();
                break;
            case 3:
                drawTheIsoscelesTriangle();
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
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the isosceles right-angled triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        return input.nextInt();
    }

    //Hàm vẽ hình chữ nhật
    private static void drawTheRectangle() {
        System.out.println("Choose the length and width of the rectangle:");
        Scanner size = new Scanner(System.in);

        System.out.print("The length:");
        int length = size.nextInt();
        System.out.print("The width:");
        int width = size.nextInt();

        System.out.printf("Draw the rectangle with the length = %d and the width = %d.\n", length, width);
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    //    Hàm vẽ tam giác vuông
    private static void drawTheIsoscelesRightAngledTriangle() {
        System.out.println("Choose the side and the corner of the isosceles right-angled Triangle:");
        Scanner input = new Scanner(System.in);

        System.out.print("The side:");
        int side = input.nextInt();

        System.out.println("1. Top-left");
        System.out.println("2. Top-right");
        System.out.println("3. Bottom-left");
        System.out.println("4. Bottom-right");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        while (choice < 1 || choice > 4) {
            System.out.println("invalid value!");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        }
        displayIsoscelesRightAngledTriangle(choice, side);
    }

    //Hàm hiển thị tam giác vuông
    private static void displayIsoscelesRightAngledTriangle(int choice, int side) {
        switch (choice) {
            case 1:
                System.out.printf("Draw the isosceles right-angled triangle with the corner at top-left and the side = %d.\n", side);
                for (int i = side; i > 0; i--) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 2:
                System.out.printf("Draw the isosceles right-angled triangle with the corner at top-right and the side = %d.\n", side);
                for (int i = side; i > 0; i--) {
                    for (int j = i; j < side; j++) {
                        System.out.print(" ");
                    }
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.printf("Draw the isosceles right-angled triangle with the corner at bottom-left and the side = %d.\n", side);
                for (int i = 1; i <= side; i++) {
                    for (int j = i; j > 0; j--) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.out.printf("Draw the isosceles right-angled triangle with the corner at bottom-right and the side = %d.\n", side);
                for (int i = side; i > 0; i--) {
                    for (int j = i; j > 1; j--) {
                        System.out.print(" ");
                    }
                    for (int j = i; j <= side; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
        }
    }

    //    Hàm vẽ tam giác cân
    private static void drawTheIsoscelesTriangle() {
    }
}
