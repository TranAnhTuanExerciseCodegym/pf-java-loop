import java.util.Scanner;

public class Find20Prime {
    public static void main(String[] args) {
        int count = 0;
        int number;
        int N = 2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter: ");
        number = scanner.nextInt();
//        for (int number = 2; ; number++) {
//            boolean prime = true;
//            int i = 2;
//            while (i <= Math.sqrt(number)) {
//                if (number % i == 0) {
//                    prime = false;
//                    break;
//                }
//                i++;
//            }
//            if (prime) {
//                count++;
//                System.out.println(number);
//            }
//            if (count == 20) {
//                break;
//            }
//        }
        while (count < number) {
            boolean prime = true;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
                System.out.println(N);
            }
            if (count == number) {
                break;
            }
            N++;
        }
        System.out.println("Count: " + " " + count + " prime");
    }
}
