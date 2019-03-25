package Lesson1.Task1;

public class Tools {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-3s ", array[i]);
        }
        System.out.printf("%n");
    }
}
