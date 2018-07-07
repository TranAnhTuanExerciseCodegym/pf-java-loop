package loop;

import java.util.Scanner;

public class DisplayTheFirst20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("xxxx");
        int num = scanner.nextInt();

        int count = 0;
        for (int number = 2; ; number++) {

            boolean isPrime = true;
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }

            if (isPrime) {
                count++;
                System.out.println(number);
            }

            if (count == num) {
                break;
            }

        }

        System.out.printf("Count: %d%n", count);
    }
}
