package Lesson1.Task1;

public class ArrayManipulationUtils {
    public static int[] generateIntArray() {
        int[] arr = new int[20];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (-10) + (int) (Math.random() * ((20) + 1));
        }
        return arr;
    }

    public static void switchArrayValues(int[] arr, int value1, int value2) {
        arr[value1] ^= arr[value2];
        arr[value2] ^= arr[value1];
        arr[value1] ^= arr[value2];
    }
}
