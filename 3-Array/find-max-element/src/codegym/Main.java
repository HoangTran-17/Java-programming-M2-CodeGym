package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        int arr[] = new int[size];
        arr = importArr(size);

        findMaxElement(arr);
    }

    private static void findMaxElement(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.printf("The largest property value in the list is %d, at position %d.",max,index);
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
