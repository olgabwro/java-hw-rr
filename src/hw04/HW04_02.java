package hw04;

public class HW04_02 {
    public static void main(String[] args) {
        /**
         * Задача №1
         * Дана строка:
         * String s = “Перестановочный алгоритм быстрого действия”;
         * необходимо вывести все буквы “о” из этой строки.
         * Для указанной строки ответ будет “ооооо” (или в столбик)
         */
        System.out.println("Task1");

        String s1 = "Перестановочный алгоритм быстрого действия";
        char litter1 = 'о';

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == litter1) {
                System.out.print(s1.charAt(i));
            }
        }

         /**
         * Задача №2
         * Дана строка:
         * String s = “Перевыборы выбранного президента”;
         * необходимо подсчитать количество букв “е” в строке.
         * Для указанной строки ответ будет 4.
         */
        System.out.println("\n\nTask2");

        String s2 = "Перевыборы выбранного президента";
        char litter2 = 'е';
        int count = 0;

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == litter2) {
                count++;
            }
        }
        System.out.print("количество букв “е” в строке “Перевыборы выбранного президента” = " + count);

         /**
         * Задача №3
         * Дана строка:
         * String s = “Посмотрите как Рите нравится ритм”;
         * необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
         * Для указанной строки ответ будет 6, 15, 29.
         */
        System.out.println("\n\nTask3");

        int countStrWithE = 0;
        int countStr = 0;
        char letter3 = 'е';
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};

        for (int i = 0; i < array.length; i++) {
            countStr += array[i].length;
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length(); k++) {
                    if (array[i][j].charAt(k) == letter3) {
                        countStrWithE++;
                        break;
                    }
                }
            }
        }
        System.out.println(countStr);
        System.out.println(countStrWithE);
        System.out.println("количество строк в массиве, которые не содержат буквы “е”: " + (countStr - countStrWithE));

        /**
        * Экстра задача
        * Дан массив:
        * String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
        * необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        */

        System.out.println("\nExtraTask");

        String sExtra = "Посмотрите как Рите нравится ритм";
        sExtra = sExtra.toLowerCase();
        String subStr = "рит";

        System.out.print("Индексы начала подстрок “рит”:" );
        for (int i = 0; i < sExtra.length() - 2; i++) {
            if (subStr.equals("" + sExtra.charAt(i) + sExtra.charAt(i + 1) + sExtra.charAt(i + 2))) {
                System.out.print("\t" + i);
            }
        }
    }
}
