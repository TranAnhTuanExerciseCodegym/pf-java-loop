package OOP;

import java.util.Random;


public class test {
    public static void main(String[] args) {
        Random random = new Random();
        int x;
        for (int i = 0; i < 3; i++) {
            x = random.nextInt(99);
            System.out.println(x);
        }
    }
}

