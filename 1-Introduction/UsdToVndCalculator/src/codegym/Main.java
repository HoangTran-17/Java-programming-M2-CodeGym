package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter USD: ");
        float USD = scanner.nextFloat();

        float VND = USD * rate;

        System.out.print(USD + " USD into "+ VND +" VND.");
    }
}
