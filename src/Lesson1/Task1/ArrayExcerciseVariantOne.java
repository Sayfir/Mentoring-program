package Lesson1.Task1;

/*
* 1 Написать программу, осуществляющую обработку массива. Исходные условия:
массив содержит только целые числа от -10 до 10 (допускается генерация
элементов с помощью метода (int) Math.random()), программа должна выводить
в консоль исходный массив и полученный результат, количество элементов в
массиве 20.
Варианты задания:
1. В массиве целых чисел поменять местами максимальный отрицательный
элемент и минимальный положительный.*/


public class ArrayExcerciseVariantOne {
    public static void main(String[] args) {
        ArrayExcerciseVariantOne arrayExcercises = new ArrayExcerciseVariantOne();
        arrayExcercises.startProgram();
    }
    public void startProgram() {
        int[] arr = ArrayManipulationUtils.generateIntArray();
        LoggingUtils.printArray(arr);
        int maxNegativeIndex = getMaxNegativeIndex(arr);
        int minPositiveIndex = getMinPositive(arr);
        System.out.println("Index with min neg = " + maxNegativeIndex);
        System.out.println("Index with min pos = " + minPositiveIndex);
        ArrayManipulationUtils.switchArrayValues(arr, maxNegativeIndex, minPositiveIndex);
         for (int i = 0; i < arr.length; i++) {
              System.out.println("[" + i + "] " + arr[i]);
        }
    }
    private static int getMaxNegativeIndex(int[] array) {
        int min = 0;
        int minIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    private static int getMinPositive(int[] array) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0 && array[index] < min) {
                min = array[index];
                minIndex = index;
            }
        }
        return minIndex;
    }
}



