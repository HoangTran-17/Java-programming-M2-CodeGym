package Rectangle;

import java.util.Scanner;

public class RectangleMain {
    public static void main(String[] args) {
        Scanner rec = new Scanner(System.in);

        System.out.print("Enter the width:");
        double width = rec.nextDouble();
        System.out.print("Enter the height:");
        double height = rec.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.printf("Your Rectangle \n%s",rectangle.display());
        System.out.printf("\nPerimeter of the Rectangle: %.3f",rectangle.getPerimeter());
        System.out.printf("\nArea of the Rectangle: %.3f",rectangle.getArea());
    }
}
