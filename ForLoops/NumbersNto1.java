package ForLoops;

import java.util.Scanner;

public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = number; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
