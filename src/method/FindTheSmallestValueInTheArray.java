package method;

public class FindTheSmallestValueInTheArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int x : array) {
            System.out.print(x + "\t");
        }
        System.out.println();

        int min = arrayMin(array);
        System.out.println(min);

    }

    private static int arrayMin(int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i + 1;
            }
        }
        System.out.print("Minimal number position is: " + index + " number min: ");
        return min;
    }
}
