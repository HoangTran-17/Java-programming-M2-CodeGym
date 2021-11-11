package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        int arr[] = new int[size];
        arr = importArr(size);

        addElement(arr);

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

    private static void addElement(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value want to add: ");
        int value = input.nextInt();
        System.out.print("Enter index want to add: ");
        int index = input.nextInt();

        showArrayBeforeAddElement(arr);

        int[] newArr = new int[arr.length + 1];
        newArr = add(arr, value, index);

        showArrayAfterAddElement(newArr);

    }

    private static void showArrayBeforeAddElement(int[] arr) {
        System.out.print("Array before add value: [");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d]\n", arr[arr.length - 1]);
    }


    private static int[] add(int[] arr, int value, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];

            } else {
                newArr[i + 1] = arr[i];

            }
        }
        newArr[index] = value;

        return newArr;
    }

    private static void showArrayAfterAddElement(int[] newArr) {
        System.out.print("Array after add value: [");
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.printf("%d, ", newArr[i]);
        }
        System.out.printf("%d]", newArr[newArr.length - 1]);
    }

}
