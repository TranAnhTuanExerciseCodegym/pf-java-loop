package method;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = scanner.nextInt();
        int sum = sumDigits(number);
        System.out.println("Sum Digits: " + sum);
    }

    private static int sumDigits(int number) {
        int sum = 0;
        do {
            sum += number % 10;
            number = number / 10;
        } while (number >= 10);
        sum += number;
        return sum;
    }
}
