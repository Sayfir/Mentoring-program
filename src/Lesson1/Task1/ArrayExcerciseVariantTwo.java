package Lesson1.Task1;

/*В массиве целых чисел определить сумму элементов, состоящих на
чётных позициях.
*/


public class ArrayExcerciseVariantTwo {
    public static void main(String[] args) {
        ArrayExcerciseVariantTwo arrayExcerciseVariantTwo = new ArrayExcerciseVariantTwo();
        arrayExcerciseVariantTwo.startProgram();
    }
    public void startProgram() {
        ArrayManipulationUtils.generateIntArray();
        LoggingUtils.printArray(ArrayManipulationUtils.generateIntArray());
        System.out.println(getSum(ArrayManipulationUtils.generateIntArray()));
    }
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > 0 && i % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}











