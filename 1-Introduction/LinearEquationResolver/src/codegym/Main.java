package codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver ");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner scanner = new Scanner(System.in); //gọi thư viện Scanner để nhận dữ liệu từ người dùng nhập vào

        System.out.print("a = ");
        double a = scanner.nextDouble(); //Nhập giá trị a

        System.out.print("b = ");
        double b = scanner.nextDouble();//Nhập giá trị b

        System.out.print("c = ");
        double c = scanner.nextDouble();//Nhập giá trị c

        if (a == 0) {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm!");
            }
            else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            double x = (c - b) / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
