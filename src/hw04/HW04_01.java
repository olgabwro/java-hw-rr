package hw04;

import java.util.Arrays;

public class HW04_01 {
    public static void main(String[] args) {
        /**
         * Задача №1. Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести все нечетные числа из массива.
         */
        System.out.println("Task1");

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }

        /**
         * Задача №2. Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести все значения массива больше 5.
         */
        System.out.println("\nTask2");

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                System.out.println(array[i]);
            }
        }

        /** Задача №3.Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо увеличить все значения массива на 15.
         */

        System.out.println("\nTask3");

        for (int i = 0; i < array.length; i++) {
            array[i] += 15;
        }
        System.out.println(Arrays.toString(array));

        /**
         * Задача №4. Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести сумму всех значений массива.
         */
        System.out.println("\nTask4");
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum of array's elements = " + sum);
    }
}