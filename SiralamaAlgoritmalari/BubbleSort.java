import java.util.Random;

public class BubbleSort {
    /*
     * public static int[] bubbleSort(int[] array, int length) {
     * 
     * if (length == 2) {
     * return array;
     * }
     * System.out.println("baştannn ::::" + length);
     * System.out.println();
     * for (int i = 0; i < length - 1; i++) {
     * int temp;
     * 
     * if (array[i] > array[i + 1]) {
     * System.out
     * .println("degisiklik varrr : array[" + i + "] : " + array[i] + " ile array["
     * + (i + 1) + "] : "
     * + array[i + 1]);
     * System.out.println();
     * temp = array[i];
     * array[i] = array[i + 1];
     * array[i + 1] = temp;
     * }
     * }
     * 
     * return bubbleSort(array, length - 1);
     * }
     */

    static public int[] bubbleSort(int[] array) {

        int counter = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp;
                if (array[j] > array[j + 1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }
                counter++;
            }

        }
        System.out.println("counter :" + counter);
        return array;

    }

    static public int[] selectionSort(int[] array) {
        int min = 0, sequenceMin = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            sequenceMin = i;
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    sequenceMin = j;
                }

            }
            int temp;
            temp = array[i];
            array[i] = min;
            array[sequenceMin] = temp;

        }

        return array;
    }

    public static void main(String[] args) {
        // 3 5 7 9 1 0 6

        int[] array = { 3, 1, 7, 5, 10, 8, 2, 6 };
        /*
         * int[] array = new int[1000];
         * Random random = new Random();
         * for (int i = 0; i < 1000; i++) {
         * array[i] = random.nextInt(1000);
         * }
         */

        /*
         * System.out.println("önce : ");
         * for (int i : array) {
         * System.out.printf("%d ", i);
         * }
         */
        selectionSort(array);
        System.out.println("\n-------------------------\nSonra");

        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();

    }
}