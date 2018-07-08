package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = 2 * this.b - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return r2;

    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter b: ");
        double b = scanner.nextDouble();

        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        double discriminant = quadraticEquation.getDiscriminant();
        double root1 = quadraticEquation.getRoot1();
        double root2 = quadraticEquation.getRoot2();

        if (discriminant > 0) {
            System.out.println("QuadraticEquation has two results: " + root1 + "\t" + root2);

        } else if (discriminant == 0) {
            System.out.println("QuadraticEquation has one result: " + root1);

        } else {
            System.out.println("The equation has no roots");
        }
    }
}
