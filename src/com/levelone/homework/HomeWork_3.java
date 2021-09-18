package com.levelone.homework;

import java.util.Arrays;
import java.util.Random;

/**
 * Java 1. HomeWork 3
 *
 * @author Irina Marchenko
 * @version 18.09.2021
 */
public class HomeWork_3 {
    public static void main(String[] args) {
        System.out.println("**********************");
        invertArray();

        System.out.println("**********************");
        fillArray();

        System.out.println("**********************");
        changeArray();

        System.out.println("**********************");
        fillDiagonal();

        System.out.println("**********************");
        fillMatrix();

        System.out.println("**********************");
        System.out.println(Arrays.toString(createAndFillArray(5, 10)));

        System.out.println("**********************");
        findMinMax();
    }

    /*  Задать целочисленный массив, состоящий из элементов 0 и 1.
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        System.out.println("Array Before invert\n " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;

            //if variant
//            if(arr[i] == 1) {
//                arr[i] = 0;
//            } else {
//                arr[i] = 1;
//            }

        }
        System.out.println("Array After invert\n " + Arrays.toString(arr));
    }

    /*  Задать пустой целочисленный массив длиной 100.
        С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    */
    static void fillArray() {
        int[] arr = new int[100];

        for (int i = 1; i <= arr.length; i++) {
            arr[i - 1] = i;
        }

        System.out.println(Arrays.toString(arr));
    }

    /* Задать массив пройти по нему циклом, и числа меньшие 6 умножить на 2 */
    static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Array before change\n " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }

        }
        System.out.println("Array after change\n " + Arrays.toString(arr));
    }

    /* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
       и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    */
    static void fillDiagonal() {
        int[][] arr = new int[4][4];
        int diagonal = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i == j ? diagonal : 0;
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    /* Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
       и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    */
    static void fillMatrix() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - i - 1] = 1;
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    /* Написать метод, принимающий на вход два аргумента: len и initialValue,
       и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    */
    static int[] createAndFillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    /* Задать одномерный массив и найти в нем минимальный и максимальный элементы */
    static void findMinMax() {
        int[] arr = new int[5];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Array values: " + Arrays.toString(arr));

        int minValue, maxValue;

        minValue = maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }

            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }

        System.out.println("Max value in array: " + maxValue);
        System.out.println("Min value in array: " + minValue);
    }


}
