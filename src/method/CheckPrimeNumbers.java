package method;

import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        boolean checkPrime = prime(number);
        System.out.println(checkPrime);
    }

    private static boolean prime(int number) {
        boolean check = true;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " not is prime");
        }
        return check;
    }
}
