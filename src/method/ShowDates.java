package method;

import java.util.Scanner;

public class ShowDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year start");
        int year = scanner.nextInt();
        System.out.println("Enter year end");
        int yearNext = scanner.nextInt();
        int count = numberOfDaysInAYear(year, yearNext);
        if (year > 0 && yearNext > 0) {
            System.out.println("Total day is: " + count);
        } else {
            System.out.println("Enter the wrong year!");
        }
    }

    private static int numberOfDaysInAYear(int year, int yearNext) {
        int residual = yearNext - year;
        int day = residual * 360;
        return day;
    }
}
