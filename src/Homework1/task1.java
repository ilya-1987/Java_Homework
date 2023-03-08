package Homework1;
/* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n) */
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int num = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", triangularNumber(num));
        System.out.printf("Факториал числа: %d\n", factorialNumber(num));

        iScanner.close();
    }

    public static int triangularNumber(int a) {
        for (int i = 1; i < 5; i++) {
            a = a + i;
        }
        return a;
    }

    public static int factorialNumber(int a) {
        for (int i = 1; i < 5; i++) {
            a = a * i;
        }
        return a;
    }




}
