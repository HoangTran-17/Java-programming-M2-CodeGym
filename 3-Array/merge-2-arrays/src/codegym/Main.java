package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nameArr1 = "Array 1";
        int sizeArr1 = inputSize(nameArr1);
        int arr1[] = new int[sizeArr1];
        arr1 = importArr(sizeArr1,nameArr1);

        String nameArr2 = "Array 2";
        int sizeArr2 = inputSize(nameArr2);
        int arr2[] = new int[sizeArr2];
        arr2 = importArr(sizeArr2,nameArr2);

        showArray(arr1,nameArr1);
        showArray(arr2,nameArr2);


        mergeArray(arr1,arr2);

    }

    private static int inputSize(String arrX) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.printf("Enter a size of %s: ",arrX);
            size = input.nextInt();
            if (size < 1) {
                System.out.println("Size does not exceed 20!");
            }
        } while (size < 1);
        return size;
    }

    private static int[] importArr(int size, String arrX) {
        Scanner array = new Scanner(System.in);
        int arr[] = new int[size];
        System.out.printf("Import array %s: \n",arrX);
        for (int i = 0; i < size; i++) {
            arr[i] = array.nextInt();
        }
        return arr;
    }

    private static void mergeArray(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        newArr = add(arr1,arr2);
        String name = "New array";

        showArray(newArr,name);
    }

    private static void showArray(int[] arr, String arrX) {
        System.out.printf("%s: [",arrX);
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d, ", arr[i]);
        }
        System.out.printf("%d]\n", arr[arr.length - 1]);
    }

    private static int[] add(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr1.length) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i - arr1.length];
            }
        }
        return newArr;
    }
}
