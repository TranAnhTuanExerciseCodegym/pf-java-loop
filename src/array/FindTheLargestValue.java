package array;

import java.util.Scanner;

public class FindTheLargestValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter array size: ");
            size = scanner.nextInt();
            if (size > 10) {
                System.out.println("not to exceed 10");
            }
        } while (size > 10);
        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Element List: ");
        for (int x : array) {
            System.out.print(x + " ");
        }

        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index++;
            }
        }
        System.out.println("\n" + "Element max: " + max + " location: " + index);
    }
}
