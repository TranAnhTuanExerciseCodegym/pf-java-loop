package method;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        number = scanner.nextInt();
        int palindrome = reverse(number);
        System.out.println("Reverse Number " + number + " is: " + palindrome);
    }

    private static int reverse(int number) {
        int reverse = 0;
        do {
            int remain = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + remain;
        } while (number > 10);
        reverse = (reverse * 10) + number;
        return reverse;
    }
}
