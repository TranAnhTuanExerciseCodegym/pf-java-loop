package array;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int[] array1 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println("Enter number add: ");
        int number = scanner.nextInt();
        System.out.println("Enter index add: ");
        int index = scanner.nextInt();

        for (int i = 0; i < index - 1; i++) {
            array1[i] = array[i];
        }
        for (int x : array1) {
            System.out.print(x + " ");
        }
        System.out.println();

        array1[index - 1] = number;
        for (int i = index; i < array1.length; i++) {
            array1[i] = array[i - 1];
        }
        for (int x : array1) {
            System.out.print(x + " ");
        }
    }
}
