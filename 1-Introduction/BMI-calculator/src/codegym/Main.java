package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight(kg): ");
        float weight = scanner.nextFloat();

        System.out.println("Enter height(m): ");
        float height = scanner.nextFloat();

        float BMI = (float) (weight / Math.pow(height,2));
        if (BMI < 18.5) {
            System.out.print("BMI = "+BMI+" - Underweight!");
        } else {
            if (BMI < 25) {
                System.out.print("BMI = "+BMI+" - Normal!");
            } else {
                if (BMI < 30) System.out.print("BMI = "+BMI+" - Overweight");
                else {
                    System.out.print("BMI = "+BMI+" - Obese");
                }
            }
        }
    }
}
