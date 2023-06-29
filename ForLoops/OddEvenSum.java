package ForLoops;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int oddNumbers = 0;
        int evenNumbers = 0;

        for (int i = 0; i < numbers; i++) {
            int newNumbers = scanner.nextInt();

            if (i % 2 == 1) {
                oddNumbers += newNumbers;
            }else {
                evenNumbers += newNumbers;
            }
        }
        if (evenNumbers == oddNumbers) {
            System.out.print("Yes");
            System.out.printf("%nSum = %d", evenNumbers);
        }else {
            int diff = Math.abs(oddNumbers - evenNumbers);
            System.out.printf("No%n");
            System.out.printf("Diff = %d", diff);
        }
    }
}
