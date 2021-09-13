package com.levelone.homework;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        System.out.println("*------------------*");
        checkSumSign();
        System.out.println("*------------------*");
        printColor();
        System.out.println("*------------------*");
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -11;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("sum = " + sum + " сумма положительна");
        } else {
            System.out.println("sum = " + sum + " сумма отрицательна");
        }
    }

    public static void printColor() {
        int value = -10;

        if (value <= 0) {
            System.out.println("value = " + value + " Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("value = " + value + " Жёлтый");
        }
        if (value > 100) {
            System.out.println("value = " + value + " Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 22;
        int b = 22;

        if (a >= b) {
            System.out.println(" a >= b");
        } else {
            System.out.println(" a < b");
        }
    }
}
