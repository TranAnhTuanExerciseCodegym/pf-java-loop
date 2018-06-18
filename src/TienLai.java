import java.util.Scanner;

public class TienLai {
    public static void main(String[] args) {
        double money;
        double interest_rate;
        int month;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien cho vay:");
        money = scanner.nextDouble();
        System.out.println("Nhap so thang cho vay: ");
        month = scanner.nextInt();
        System.out.println("Ti le lai moi thang: ");
        interest_rate = scanner.nextDouble();
        double total_interest = 0;
        for (int i = 0; i < month; i++) {
            total_interest = money * (interest_rate / 100) / 12 * month;
        }
        System.out.println("So tien lai hang thang la: "+ total_interest);
    }

}

