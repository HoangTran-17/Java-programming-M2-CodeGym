package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        int arr[] = new int[size];
        arr = importArr(size);

        findMinValue(arr);
    }

    private static void findMinValue(int[] arr) {
        int min = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        System.out.printf("The minimum property value in the list is %d, at position %d.",min,index);
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

    private static int[] importArr(int size) {
        Scanner array = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.println("Import array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = array.nextInt();
        }
        return arr;
    }
}
