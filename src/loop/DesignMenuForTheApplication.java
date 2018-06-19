package loop;

import java.util.Scanner;

public class DesignMenuForTheApplication {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("1. Rectangle");
            System.out.println("2. Square");
            System.out.println("3. Triangular");
            System.out.println("Enter Choice");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Rectangle");
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print("*");
                            System.out.print(" ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    System.out.println("Square");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    //top left
                    System.out.println("Triangular");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 5; j > i; j--) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    //bottom-left
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; i > j; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    //bottom-right

                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < 5; j++) {
                            if (j < i) {
                                System.out.print("  ");
                            } else {
                                System.out.print(" *");
                            }
                        }
                        System.out.println("");
                    }
                    //top-right
                    System.out.println(" ");
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            if (j < i) {
                                System.out.print(" ");
                            } else {
                                System.out.print("*");
                            }
                        }
                        System.out.println(" ");
                    }

                    //isosceles triangle
                    for (int i = 5; i > 0; i--) {
                        for (int j = 0; j < 5; j++) {
                            if (j < i - 1) {
                                System.out.print(" ");
                            } else {
                                System.out.print("* ");
                            }
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}
