package hw02;

public class HW02 {
    public static void main(String[] args) {
        /** Задача №1.
         Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным
         на ваш выбор и вывести результаты следующих операций с этими переменными:
         * сложение;
         * умножение;
         * вычитание;
         * деление;
         * остаток от деления.
         Так же сделать проверку на четность этих переменных и вывести результат.
         */
        System.out.println("\t***Task1***");

        int num1 = 20;
        int num2 = 5;

        System.out.println("a + b = " + (num1 + num2));
        System.out.println("a - b = " + (num1 - num2));
        System.out.println("a * b = " + (num1 * num2));
        System.out.println("a / b = " + (num1 / num2));
        System.out.println("a % b = " + (num1 % num2));
        System.out.println("Remainder of " + num1 + " divided by 2 = " + (num1 % 2));
        System.out.println("Remainder of " + num2 + " divided by 2 = " + (num2 % 2));

        /** Задача №2.
         Необходимо создать целочисленные переменные a и b, присвоить им произвольные значения,
         а потом поменять значения местами (значение переменной a должно оказаться в переменной b и наоборот).
         */
        System.out.println("\n\t***Task2***");

        int a = 5;
        int b = 20;
        int c;
        System.out.println(a);
        System.out.println(b);

        c = a + b;
        a = c - a;
        b = c - a;
        System.out.println(a);
        System.out.println(b);

        /** Задача №3.
         Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
         половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
         Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
         Вывести на экран кому сколько пиастров полагается
         Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
         */
        System.out.println("\n\t***Task3***");

        double pirateLoot = 1000;
        int pirateNumber = 5;

        double shipOwnerLoot = pirateLoot / 2;
        double captainLoot = (pirateLoot - shipOwnerLoot) / 2;
        double ordinaryPirateLoot = (pirateLoot - shipOwnerLoot - captainLoot) / pirateNumber;
        double captainJackLoot = captainLoot + shipOwnerLoot + ordinaryPirateLoot;

        System.out.println("loot of the captain Jack = " + captainJackLoot);
        System.out.println("loot of the ordinary pirate = " + ordinaryPirateLoot);
    }
}