package OOP;

import java.util.Scanner;

public class BuildClassStock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    //Constructor
    public BuildClassStock() {
    }

    public BuildClassStock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getChangePercent() {
        double percentage = (this.currentPrice - this.previousClosingPrice) / (this.previousClosingPrice / 100);
        return percentage;
    }

    public static void main(String[] args) {
        BuildClassStock buildClassStock = new BuildClassStock("OSI", "hello");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter previous Closing Price: ");
        buildClassStock.previousClosingPrice = scanner.nextInt();
        System.out.println("enter current Price");
        buildClassStock.currentPrice = scanner.nextInt();
        double percentage = buildClassStock.getChangePercent();
        System.out.println(percentage);
        System.out.println(buildClassStock.name);
        System.out.println(buildClassStock.symbol);
    }
}
