package method;

import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side 1: ");
        int side1 = scanner.nextInt();
        System.out.println("enter side 2: ");
        int side2 = scanner.nextInt();
        System.out.println("enter side 3: ");
        int side3 = scanner.nextInt();

        boolean isTriangle = isValid(side1, side2, side3);
        double area = areaTriangle(side1, side2, side3);
        System.out.println(isTriangle);
        if (isTriangle) {
            System.out.println("Area triangle is: " + area);
        } else {
            System.out.println("Not a triangle");
        }
    }

    private static double areaTriangle(int side1, int side2, int side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    private static boolean isValid(int side1, int side2, int side3) {
        boolean check = true;
        if (side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            check = false;
        }
        return check;
    }
}
