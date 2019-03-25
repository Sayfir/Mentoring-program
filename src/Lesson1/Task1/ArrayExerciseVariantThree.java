package Lesson1.Task1;

/*В массиве целых чисел заменить нулями отрицательные элементы.
 */

/**
 * @author Andrii Prokofiev
 * @version 1.0
 */

public class ArrayExerciseVariantThree {
    public static void main(String[] args) {
        ArrayExerciseVariantThree arrayExerciseVariantThree = new ArrayExerciseVariantThree();
        arrayExerciseVariantThree.startProgram();
    }

    private void startProgram() {
        int[] intArray = getIntArray();
        printArray(intArray);
        changeToNull(intArray);
        printArray(intArray);
    }

    private static int[] getIntArray() {
        int[] arr = new int[20];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (-10) + (int) (Math.random() * ((20) + 1));
        }
        return arr;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-3s ", array[i]);
        }
        System.out.printf("%n");
    }

    private static void changeToNull(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }
}




