package codegym;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        System.out.print("First twenty primes: ");
        for (int i = 2; count <= 20 ; i++) {
            if (isPrimesNumber(i)) {
                System.out.print(i);
                ++count;
                if (count < 21) {
                    System.out.print(", ");
                } else {
                    System.out.print(".");
                }
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
