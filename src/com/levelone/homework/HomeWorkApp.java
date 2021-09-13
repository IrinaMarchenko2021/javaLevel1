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

    static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    static void checkSumSign() {
        int a = 10;
        int b = -11;

        String str = (a + b) >=0 ? "сумма положительна" : "сумма отрицательна";
        System.out.println(str);
    }

    static void printColor() {
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

    static void compareNumbers() {
        int a = 22;
        int b = 25;

        String str = (a >= b) ? " a >= b" : " a < b";
        System.out.println(str);

    }
}
