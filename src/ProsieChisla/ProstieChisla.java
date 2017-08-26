package ProsieChisla;

import java.util.Scanner;

public class ProstieChisla {

    private static Scanner in;

    public static void main(String[] args) {

        in = new Scanner(System.in);
        System.out.print("Введите числа:");
        int num = in.nextInt();

        for (int i = 2; i <= num; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
