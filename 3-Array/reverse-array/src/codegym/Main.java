package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        int arr[] = new int[size];
        arr = importArr(size);

        System.out.print("Show array before reverse: ");
        showArr(arr);

        arr = reverseArr(arr);
        System.out.print("\nShow array after reverse: ");
        showArr(arr);
    }

    private static void showArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length -1; i++) {
            System.out.printf("%d, ",arr[i]);
        }
        System.out.print(arr[arr.length -1]);
        System.out.print("]");

    }

    private static int[] reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
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

    private static int inputSize() {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if (size > 20 || size < 1) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size > 20 || size < 1);
        return size;
    }
}
