package ForLoops;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = scanner.nextInt();
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;
        int sumWithoutMaxNumber = Math.abs(sum - maxNumber);


        for (int i = 0; i < numbers; i++) {
            int newNumbers = scanner.nextInt();
            sum += newNumbers;

            if (newNumbers > maxNumber) {
                maxNumber = newNumbers;
            }
            sumWithoutMaxNumber = Math.abs(sum - maxNumber);
        }
        if (maxNumber == sumWithoutMaxNumber) {
            System.out.print("Yes");
            System.out.printf("%nSum = %d", maxNumber);
        } else {
            System.out.print("No");
            int diff = Math.abs(sum - sumWithoutMaxNumber);
            System.out.printf("%nDiff = %d",diff);
        }

    }
}
