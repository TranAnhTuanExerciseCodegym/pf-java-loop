package method;

import java.util.Scanner;

public class SortInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1");
        int number1 = input.nextInt();
        System.out.println("Enter number 2");
        int number2 = input.nextInt();
        System.out.println("Enter number 1");
        int number3 = input.nextInt();

        int[] numbers = {number1, number2, number3};
        int[] SortFromBigToBaby = SortFromBigToBabyArray(numbers);
        for (int x : SortFromBigToBaby){
            System.out.println(x);
        }

    }

    private static int[] SortFromBigToBabyArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[i] < numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}

