package array;

import java.util.Scanner;

public class FindTheSmallestValue {
    public static void main(String[] args) {
        int []array = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++){
            System.out.print("Number Element: ");
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.print("Smallest Value: " + min);
    }
}
