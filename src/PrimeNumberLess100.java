public class PrimeNumberLess100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int j = 2;
            boolean prime = true;
            while (j <= Math.sqrt(i)) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
                j++;
            }
            if (prime) {
                System.out.println("prime :" + i);
            }
        }
    }
}
