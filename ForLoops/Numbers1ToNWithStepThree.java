package ForLoops;

import java.util.Scanner;

public class Numbers1ToNWithStepThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 1; i <= number; i = i + 3) {
            System.out.println(i);
        }
    }
}
