package advancedMethod;

import java.util.Scanner;

public class CalculatedFactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println("Factorial calculation program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("factorial input: ");
        int N = scanner.nextInt();
        int fact = factorial(N);
        System.out.println("The factorial of N is: " + fact);
    }

    private static int factorial(int N) {
        if (N <= 1) {
            return 1;
        }
        return N * factorial(N - 1);
    }
}
