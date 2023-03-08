package Homework1;
/* Вывести все простые числа от 1 до 1000 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Все простые числа в диапазоне от 1 до 1000: " + primes);
    }

}
