package practice2.assignment2;

public class ArrayStat {
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("Array is null or empty");
        }

        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    public static int findMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("Array is null or empty");
        }

        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public static double calculateAvg(int[] array) {
        if (array == null || array.length == 0) {
            throw new RuntimeException("Array is null or empty");
        }

        double bank = 0;

        for (int i = 1; i < array.length; i++) {
            bank += array[i];
        }

        return bank / array.length;
    }
}
