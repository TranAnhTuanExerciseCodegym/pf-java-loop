package array;

import java.util.Scanner;

public class LumpedArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array1");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        System.out.println("-------------");
        System.out.println("Array2");
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter Element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        int size = array1.length + array2.length;
        int[] array3 = new int[size];
        int temp;

        for (int i = 0; i < array1.length; i++) {
            temp = array1[i];
            array3[i] = temp;
        }

        for (int i = 0; i < array2.length; i++) {
            temp = array2[i];
            array3[array1.length + i] = temp;
        }
        System.out.println("------");
        System.out.println("List array3");
        for (int x : array3
                ) {
            System.out.print(x + " ");
        }
    }
}
