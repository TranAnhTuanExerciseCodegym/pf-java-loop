package array;

import java.util.Scanner;

public class findArrayValue {
    public static void main(String[] args) {
        String[] names = {"a", "b", "c"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.next();

//        boolean check = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                System.out.println("haha " + name + (i + 1));
//                check = true;
                break;
            }
        }
//        if (!check){
//            System.out.println(name);
//        }
    }
}
