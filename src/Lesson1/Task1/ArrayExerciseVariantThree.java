package Lesson1.Task1;

/*В массиве целых чисел заменить нулями отрицательные элементы.
 */


public class ArrayExerciseVariantThree {
    public static void main(String[] args) {
        ArrayExerciseVariantThree arrayExerciseVariantThree = new ArrayExerciseVariantThree();
        arrayExerciseVariantThree.startProgram();
    }
    private void startProgram() {
        int[] intArray = ArrayManipulationUtils.generateIntArray();
        LoggingUtils.printArray(intArray);
        changeToNull(intArray);
        LoggingUtils.printArray(intArray);
    }
    private static void changeToNull(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }
}




