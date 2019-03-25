package Lesson1.Task1;

/*В массиве целых чисел определить сумму элементов, состоящих на
чётных позициях.
*/

/**
 * @author Andrii Prokofiev
 * @version 1.0
 */

public class ArrayExcerciseVariantTwo {
    public static void main(String[] args) {
        ArrayExcerciseVariantTwo arrayExcerciseVariantTwo = new ArrayExcerciseVariantTwo();
        arrayExcerciseVariantTwo.startProgram();
    }

    public void startProgram() {

        Tools.printArray(getIntArray());
        System.out.println(getSum(getIntArray()));
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


    public static int[] getIntArray() {
        int[] arr = new int[20];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = (-10) + (int) (Math.random() * ((20) + 1));
        }
        return arr;
    }
}











