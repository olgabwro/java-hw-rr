package hw03;

public class HW03 {
    public static void main(String[] args) {
        /* Задача №1.
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        * a == b - если переменные равны;
        * a < b - если переменная a меньше b;
        * a > b - если переменная b меньше a.
        */

        System.out.println("*** Task1 ***");

        int a, b;
        a = 55;
        b = 50;

        if (a == b) {
            System.out.println("a = b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a < b");
        }

        /* Задача №2.
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        * maybe a and b are even - если сумма переменных четная;
        * some variable is odd - если сумма переменных нечетная.
        */

        System.out.println("\n*** Task2 ***");

        if ((a + b) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        /* Задача №3.
        Необходимо создать целочисленную переменную, присвоить произвольное
        значение переменной на ваш выбор и вывести следующие строки:
        * больше 10 - если переменная больше 10;
        * меньше 100 - если переменная меньше 100;
        * результат деления на 2 больше 20 - если это соответствует истине;
        * значение переменной между 5 и 40 включительно - если это правда;
        * значение переменной меньше 5 или больше 40 - если предыдущие условие ложное.
        */

        System.out.println("\n*** Task3 ***");

        int number = 22;

        if (number > 10) {
            System.out.println(number + " больше 10");
        }
        if (number < 100) {
            System.out.println(number + " меньше 100");
        }
        if (number % 2 > 20) {
            System.out.println("результат деления " + number + " на 2 больше 20");
        }
        if (number >= 5 && number <= 40) {
            System.out.println("значение переменной number = " + number + " между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной number = " + number + " меньше 5 или больше 40");
        }
    }
}