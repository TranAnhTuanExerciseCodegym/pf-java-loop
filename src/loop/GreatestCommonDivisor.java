package loop;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number One: ");
        int numberOne = scanner.nextInt();
        System.out.println("Enter number Two: ");
        int numberTwo = scanner.nextInt();

        numberOne = Math.abs(numberOne);
        numberTwo = Math.abs(numberTwo);

        if (numberOne == 0 || numberTwo == 0) {
            System.out.println("No greatest common factor");
        } else {
            while (numberOne != numberTwo) {
                if (numberOne > numberTwo) {
                    numberOne = numberOne - numberTwo;
                } else {
                    numberTwo = numberTwo - numberOne;
                }
            }
            System.out.print("Greatest common divisor: " + numberOne);
        }
        scanner.close();
    }
}