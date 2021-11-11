import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean check = isPrimes(number);
        if (check) {
            System.out.printf("%d is prime number!",number);
        } else {
            System.out.printf("%d isn't prime number!",number);
        }
    }


    private static boolean isPrimes(int number) {
        for (int index = 2; index < Math.sqrt(number) ; index++) {
            if (number % index == 0) {
                return false;
            }
        }
        return true;
    }
}
