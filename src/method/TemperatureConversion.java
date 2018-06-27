package method;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        int choice;

        outPrintInformation();
        do {
            System.out.println("Enter Choice: ");
            choice = enterChoice();
            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = enterFahrenheit();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println("celsius: " + celsius);
                    break;
                case 2:
                    System.out.println("enter celsius: ");
                    celsius = enterCelsius();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.println("fahrenheit: " + fahrenheit);
                    break;
                default:
                    System.out.println("good bye! ");
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    private static double enterCelsius() {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextInt();
        return celsius;
    }

    private static int enterChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    private static double enterFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = scanner.nextInt();
        return fahrenheit;
    }

    private static void outPrintInformation() {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit!");
        System.out.println("=================");
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 1.8) + 32;
        return fahrenheit;
    }
}
