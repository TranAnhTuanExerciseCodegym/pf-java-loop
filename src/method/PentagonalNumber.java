package method;

import java.util.Scanner;

public class PentagonalNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        for (int i = 1; i <= number; i++) {
            int pentagonal = getPentagonalNumber(i);
            System.out.print(pentagonal + " ");
        }

    }

    public static int getPentagonalNumber(int number) {
        int pentagonal = number * ((3 * number) - 1) / 2;
        return pentagonal;
    }
}