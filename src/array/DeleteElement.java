package array;

import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] array1 = new int[array.length - 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index delete: ");
        int index = scanner.nextInt();

        for (int i = 0; i < index - 1; i++) {
            array1[i] = array[i];
        }

        for (int i = index - 1; i < array1.length; i++) {
            array1[i] = array[i + 1];
        }

        for (int x : array1) {
            System.out.print(x + "\t");
        }
    }
}