package array;

import java.util.Scanner;

public class CountTheNumberStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter array size: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("Not exceed 10");
            }
        } while (size > 10);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            do {
                System.out.print("Enter point " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if (array[i] > 10){
                    System.out.println("No more than 10 points");
                }
            }while (array[i] > 10);
        }

        System.out.print("List points: ");
        for (int x : array
                ) {
            System.out.print(x + " ");
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 & array[i] <= 10) {
                count++;
            }
        }
        System.out.println("\n" + "Number of students passing the exam: " + count);
    }
}
