package Homework2;
/*
 * Напишите метод, который принимает на вход строку (String)
 * и определяет является ли строка палиндромом (возвращает boolean значение).
 */
import java.util.Scanner;


public class task_2_3 {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(isPalindrom(string));
        scanner.close();
    }
    public static boolean isPalindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }

}
