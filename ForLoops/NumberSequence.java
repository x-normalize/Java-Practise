package ForLoops;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < number; i++) {
            int newNumbers = scanner.nextInt();
            if (newNumbers > max) {
                max = newNumbers;
            }
            if (newNumbers < min) {
                min = newNumbers;
            }
        }
        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d%n", min);
    }
}
