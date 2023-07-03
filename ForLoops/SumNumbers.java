package ForLoops;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbersCount = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < numbersCount; i++) {
            int newNumbers = scanner.nextInt();
            sum += newNumbers;
        }

        System.out.println(sum);
    }
}
