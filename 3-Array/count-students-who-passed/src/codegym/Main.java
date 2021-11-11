package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        int arr[] = new int[size];
        arr = importArr(size);

        int count = countStudentsWhoPassed(arr);
        System.out.printf("Count student who passed is: %d.",count);
    }



    private static int inputSize() {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 30 || size < 1) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size > 30 || size < 1);
        return size;
    }

    private static int[] importArr(int size) {
        Scanner array = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Import points: ");
        for (int i = 0; i < size; i++) {
            do {
                arr[i] = array.nextInt();
            }while (arr[i] > 10 || arr[i] < 0);
        }
        return arr;
    }
    private static int countStudentsWhoPassed(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 5) {
                ++count;
            }
        }
        return count;
    }
}
