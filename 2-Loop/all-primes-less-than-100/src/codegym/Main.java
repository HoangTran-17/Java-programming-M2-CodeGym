package codegym;

public class Main {

    public static void main(String[] args) {
        System.out.print("All primes less than 100: ");
        for (int i = 2; i < 100 ; i++) {
            if (isPrimesNumber(i)) {
                System.out.printf("%d\t",i);
            }
        }
    }
    public static boolean isPrimesNumber(int number) {
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
