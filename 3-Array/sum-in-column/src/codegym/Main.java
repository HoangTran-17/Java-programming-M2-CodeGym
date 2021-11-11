package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        float arr[][] = new float[size][size];
        arr = importArr(size);

        calculateSumInColumn(arr);
    }

    private static int inputSize() {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size < 1) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size < 1);
        return size;
    }

    private static float[][] importArr(int size) {
        Scanner array = new Scanner(System.in);
        float arr[][] = new float[size][size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Import array[%d]: \n", i);
            for (int j = 0; j < size; j++) {
                arr[i][j] = array.nextFloat();
            }
        }
        return arr;
    }

    private static void calculateSumInColumn(float[][] arr) {
        Scanner input = new Scanner(System.in);
        int column;
        do {
            System.out.println("Enter a column: ");
            column = input.nextInt();
        } while (column < 0 || column > arr[0].length - 1);

        float sum = arr[0][column];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i][column];
        }
        System.out.printf("Sum in column %d is: %.3f", column, sum);
    }
}
