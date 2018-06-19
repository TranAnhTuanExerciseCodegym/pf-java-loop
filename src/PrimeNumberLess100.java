public class PrimeNumberLess100 {
    public static void main(String[] args) {
        int count = 0;
        for (int number = 2; number < 100; number++) {
            boolean prime = true;
            int y = 2;
            while (y <= Math.sqrt(number)) {
                if (number % y == 0) {
                    prime = false;
                    break;
                }
                y++;
            }
            if (prime) {
                count += 1;
                System.out.println(number);
            }
        }
        System.out.println("Have all " + count + " prime numbers");
    }
}
