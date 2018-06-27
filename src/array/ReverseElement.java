package array;

import java.util.Scanner;

public class ReverseElement {
    public static void main(String[] args) {
        int size;
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        System.out.print("Array List: ");
        for (int x : array
                ) {
            System.out.print(x + " ");
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println("\n" + "Reverse array: ");
        for (int x : array
                ) {
            System.out.print(x + " ");
        }
    }
}
