package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size = inputSize();

        int arr[] = new int[size];
        arr = importArr(size);

        removeValue(arr);

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

    private static void removeValue(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value want to delete: ");
        int value = input.nextInt();

        int index = findValueInArray(arr,value);
        if (index == -1) {
            System.out.printf("Value '%d' was not found in the array.",value);
        } else {
            showArrayBeforeRemoveValue(arr);
            int[] newArr = new int[arr.length - 1];
            newArr = remove(arr,index);
            showArrayAfterRemoveValue(newArr);
        }
    }

    private static void showArrayBeforeRemoveValue(int[] arr) {
            System.out.print("Array after remove value: [");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.printf("%d, ",arr[i]);
            }
            System.out.printf("%d]\n",arr[arr.length - 1]);
    }


    private static int findValueInArray(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    private static int[] remove(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < arr.length - 1 ; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    private static void showArrayAfterRemoveValue(int[] newArr) {
        System.out.print("Array after remove value: [");
        for (int i = 0; i < newArr.length - 1; i++) {
            System.out.printf("%d, ",newArr[i]);
        }
        System.out.printf("%d]",newArr[newArr.length - 1]);
    }

}
