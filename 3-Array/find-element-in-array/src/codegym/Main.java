package codegym;

import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] arr = {"Nguyễn Thanh Hoàng Long","Trần Nhật Hoàng"," Trần Quang Tiến",
                "Phan Văn Thanh Tân","Huỳnh Văn Thành",
                "Bùi Xuân Tân","Trần Ngọc Hữu","Huỳnh Văn Giàu"};

        System.out.println("Enter element: ");
        Scanner ele = new Scanner(System.in);
        String element = ele.nextLine();

        int index = findElement(arr,element);
        if (index == -1) {
            System.out.printf("No found %s in the list.",element);
        } else {
            System.out.printf("Position of the students in the list %s is: %d",element,index);
        }

    }

    private static int findElement(String[] arr, String element) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (Objects.equals(arr[i], element)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
