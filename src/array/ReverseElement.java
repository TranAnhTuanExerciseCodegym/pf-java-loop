package array;

import java.util.Scanner;

public class ReverseElement {
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
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Array List: ");
        for (int x : array
                ) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }

        System.out.println("\n" + "Reverse array: ");
        for (int x : array
                ) {
            System.out.print(x + " ");
        }
    }
}
