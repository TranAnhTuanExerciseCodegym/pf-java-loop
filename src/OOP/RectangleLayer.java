package OOP;

import java.util.Scanner;

public class RectangleLayer {
    double width;
    double height;

    public RectangleLayer() {
    }

    public RectangleLayer(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width * this.height) * 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        int width = scanner.nextInt();
        System.out.println("Enter height: ");
        int height = scanner.nextInt();
        RectangleLayer rectangleLayer = new RectangleLayer(width, height);
        System.out.println("Area of the rectangle: " + rectangleLayer.getArea());
        System.out.println("Perimeter of the rectangle: " + rectangleLayer.getPerimeter());
    }
}


