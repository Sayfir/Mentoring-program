package Lesson1.Task1;

public class ArrayExcerciseVariantTwo {
    public static void main(String[] args) {
        ArrayExcerciseVariantTwo arrayExcerciseVariantTwo = new ArrayExcerciseVariantTwo();
        arrayExcerciseVariantTwo.startProgram();

    }

    public void startProgram() {

       printArray(getIntArray());
        System.out.println(getSum(getIntArray()));

    }
    private static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+ " ");
        }
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











