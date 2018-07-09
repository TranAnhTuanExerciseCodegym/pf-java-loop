package method;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a String: ");
        String string = scanner.nextLine();
        int count = countLetters(string);
        System.out.println("Number letter " + string + " is " + count);

    }

    private static int countLetters(String string) {
        for (int i = 0; i < string.length(); i++) {
            String c = Character.toString(string.charAt(i));
            System.out.print(c + "\t");
        }
        System.out.println();

        return string.length();
    }
}