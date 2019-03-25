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

/**
 * @author Andrii Prokofiev
 * @version 1.0
 */

public class ArrayExcercises {

    public static void main(String[] args) {
        ArrayExcercises arrayExcercises = new ArrayExcercises();
        arrayExcercises.startProgram();
    }

    public void startProgram() {
        int[] arr = getIntArray();
        int minNegativeIndex = getMaxNegativeIndex(arr);
        int minPositiveIndex = getMinPositive(arr);
        System.out.println("Index with min neg = " + minNegativeIndex);
        System.out.println("Index with min pos = " + minPositiveIndex);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] " + arr[i]);
        }

        int temp = arr[minNegativeIndex];
        arr[minNegativeIndex] = arr[minPositiveIndex];
        arr[minPositiveIndex] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("[" + i + "] " + arr[i]);
        }


    }

    private static int getMaxNegativeIndex(int[] array) {
        int min = array[0];
        int minIndex = -1;
        for (int index = 0; index < array.length; index++) {
            if (array[index] < 0 && array[index] < min) {
                min = array[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    private static int getMinPositive(int[] array) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int index = 0; index < array.length; index++) {
            if (array[index] > 0 && array[index] < min) {
                min = array[index];
                minIndex = index;
            }
        }
        return minIndex;
    }

    private static int[] getIntArray() {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (-10) + (int) (Math.random() * ((20) + 1));
        }
        return arr;
    }


}



