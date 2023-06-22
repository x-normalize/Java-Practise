package ForLoops;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        int lefSum = 0;
        int rightSum = 0;

        for (int i = 0; i < numbers; i++) {
            int leftNumbers = scanner.nextInt();
            lefSum += leftNumbers;
        }
        for (int i = 0; i < numbers; i++) {
            int rightNumbers = scanner.nextInt();
            rightSum += rightNumbers;
        }

        if (lefSum == rightSum) {
            System.out.printf("Yes, sum = %d", lefSum);
        } else {
            int diff = Math.abs(lefSum - rightSum);
            System.out.printf("No, diff = %d", diff);
        }
    }
}
