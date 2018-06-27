package method;

import java.util.Scanner;

public class CalculateTheInterestRate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Loans: ");
        double loans = scanner.nextInt();
        System.out.println("Enter Moths: ");
        double months = scanner.nextInt();

        double intereat_rate = 0.075;
        double range;

        double capital = loans / months;
        System.out.println("Principal pay in " + months + " months: " + capital);

        range = 0;
        double first_year_interest = calculateInterest(loans, intereat_rate, range);

        range = 0.035;
        double next_year_interest = calculateInterest(loans, intereat_rate, range);

        System.out.println("Monthly amount paid in the first year: " + (capital + first_year_interest));
        System.out.println("Monthly amount paid in the next year: " + (capital + next_year_interest));
    }

    private static double calculateInterest(double loans, double intereat_rate, double range) {
        return loans * (intereat_rate + range) / 12;
    }
}
