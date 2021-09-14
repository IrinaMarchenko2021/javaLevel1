package com.levelone.homework;

/**
 * Java 1. HomeWork 2
 *
 * @author Irina Marchenko
 * @version 14.09.2021
 */
public class HomeWork2 {

    public static void main(String[] args) {
        within10and20(5, 25);
        System.out.println("************************");
        isPositiveOrNegative(-2);
        System.out.println("************************");
        isNegative(5);
        System.out.println("************************");
        printWordNTimes("Hello,Java!", 5);
        System.out.println(isYearLeap(2020));
        System.out.println(isYearLeap(2021));
        System.out.println(isYearLeap(1620));
    }

    /*
        Написать метод, принимающий на вход два целых числа и проверяющий,
        что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
        в противном случае – false.
    */
    static boolean within10and20(int a, int b) {
        return (a + b <= 20) && (a + b > 10);
    }

    /*
        Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.
    */
    static void isPositiveOrNegative(int a) {
        System.out.println( a>= 0 ? "Number is positive" : "Number is negative");
    }

    /*
        Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    */
    static boolean isNegative(int a) {
        return a < 0 ? true : false;
    }

    /*
        Написать метод, которому в качестве аргументов передается строка и число,
        метод должен отпечатать в консоль указанную строку, указанное количество раз
    */
    static void printWordNTimes(String word, int times) {
        for (int i = 0; i <= times; i++) {
            System.out.println(word);
        }
    }

    /*
        Написать метод, который определяет, является ли год високосным,
        и возвращает boolean (високосный - true, не високосный - false).
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    static boolean isYearLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

}
