package array;


public class test {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

//
//        System.out.println("xxxxxxx" + array[2][1]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

//        double[][] distances = {
//                {0, 983, 787, 714, 1375, 967, 1087},
//                {983, 0, 214, 1102, 1763, 1723, 1842},
//                {787, 214, 0, 888, 1549, 1548, 1627},
//                {714, 1102, 888, 0, 661, 781, 810},
//                {1375, 1763, 1549, 661, 0, 1426, 1187},
//                {967, 1723, 1548, 781, 1426, 0, 239},
//                {1087, 1842, 1627, 810, 1187, 239, 0},
//        };
    }
}