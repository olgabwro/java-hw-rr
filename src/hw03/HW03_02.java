package hw03;

public class HW03_02 {
    public static void main(String[] args) {
        /**
         * Задача №1. Необходимо вывести числа от 0 до 15.
         */
        System.out.println("***Task1***");
        for (int number = 0; number <= 15; number = number + 1) {
            System.out.println(number);
        }

         /* Задача №2.Необходимо вывести все положительные степени числа 5 которые меньше 10000,
         вывести результат возведения в степень.
         */
        // in USA "положительные степени" >= 0

        System.out.println("\n***Task2***");

        for (int number = 1; number < 10000; number = number * 5) {
            System.out.println(number);
        }

        //second solution
        System.out.println("\n***Task2(second solution)***");
        int num = 5;

        for (int power = 0; Math.pow(num, power) < 10000; power++) {
            System.out.println((int)Math.pow(num, power));
        }

        /* Задача №3.
         * Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
         * Реализовать 2 варианта:
         * использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
         * без использования конструкции if (шаг цикла на ваше усмотрение).
         */

        System.out.println("\n***Task3.1***");
        for (int number = 40; number <= 60; number = number + 4) {
            System.out.println(number);
        }

        System.out.println("\n***Task3.2***");
        for (int number = 40; number <= 60; number = number + 1) {
            if (number % 4 == 0) {
                System.out.println(number);
            }
        }
    }
}