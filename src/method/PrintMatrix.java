package method;

import java.util.Scanner;

public class PrintMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number");
            int number = input.nextInt();
            printMatrix(number);
        }
    }

    public static void printMatrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                int random = (int) (Math.random() * 10);
                if (random % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
//                int matrix = random % 2;
//                System.out.print(matrix);
            }
            System.out.println();
        }
    }
}
