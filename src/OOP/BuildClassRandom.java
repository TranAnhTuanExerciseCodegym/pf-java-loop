package OOP;

import java.util.Random;
import java.util.Scanner;

public class BuildClassRandom {
    private int number;

    public BuildClassRandom() {
    }

    public BuildClassRandom(int number) {
        this.number = number;
    }

    public int RandomInt(int number) {
        Random random = new Random();
        int randomNumber = random.nextInt(number);
        return randomNumber;
    }

    public static void main(String[] args) {
        BuildClassRandom buildClassRandom = new BuildClassRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter random from 0 to ");
        int number = scanner.nextInt();
        for (int i = 0; i < 50; i++) {
            System.out.print(buildClassRandom.RandomInt(number) + "\t");
        }

    }
}
