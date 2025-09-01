package hw05;

public class HW05 {
    public static void main(String[] args) {
        /**
         * Задача №1. Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести сумму всех значений массива.
         */
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum1 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }

        System.out.println("Task1");
        System.out.println("The sum of all array values is equal to: " + sum1);

        /** Задача №2. Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести максимальное значение массива.
         */
        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max2 = array2[0];

        for (int i = 1; i < array2.length; i++) {
            if (array2[i] > max2) {
                max2 = array2[i];
            }
        }

        System.out.println("\nTask2");
        System.out.println("The maximum value of the array is: " + max2);

        /** Задача №3. Дан массив:
         * int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
         * необходимо вывести минимальное значение массива.
         */
        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int min3 = array3[0];

        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min3) {
                min3 = array3[i];
            }
        }

        System.out.println("\nTask3");
        System.out.println("The minimum value of the array is: " + min3);

        /** Задача №4. Дан массив:
         * int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
         * необходимо вывести среднее арифметическое всех значений массива.
         */
        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int average = 0;
        int sum4 = 0;

        for (int i = 0; i < array4.length; i++) {
            sum4 += array4[i];
        }
        average = sum4 / array4.length;

        System.out.println("\nTask4");
        System.out.println("The arithmetic mean of the array values is: " + average);


        double aver = 0;
        for (int i = 0; i < array4.length; i++) {
            aver += (double)array4[i] / array4.length;
        }

        System.out.println("\nTask4 (option2)");
        System.out.println("The arithmetic mean of the array values is: " + aver);

        /** Задача №5. Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести сумму элементов массива.
         */
        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;

        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum5 += array5[i][j];
            }
        }

        System.out.println("\nTask5");
        System.out.println("The sum of all array values is equal to: " + sum5);

        /** Задача №6. Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести максимальное значение массива.
         */
        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = 0;

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (array6[i][j] > max6) {
                    max6 = array6[i][j];
                }
            }
        }

        System.out.println("\nTask6");
        System.out.println("The max value of the array is: " + max6);

        /** Задача №7
         * Дан массив:
         * int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
         * необходимо вывести количество элементов в массиве
         */
        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int min7 = 0;

        for (int i = 0; i < array7.length; i++) {
            for (int j = 0; j < array7[i].length; j++) {
                if (array7[i][j] < min7) {
                    min7 = array7[i][j];
                }
            }
        }

        System.out.println("\nTask7");
        System.out.println("The min value of the array is: " + min7);
    }
}