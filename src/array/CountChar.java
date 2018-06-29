package array;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String name = "tran anh tuan";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String enter = scanner.next();

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            String c = Character.toString(name.charAt(i));
            if (enter.equals(c)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
