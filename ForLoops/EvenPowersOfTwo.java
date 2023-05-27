package ForLoops;

import java.util.Scanner;

public class EvenPowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i <= number; i += 2) {
            int evenOfTwo = (int) Math.pow(2, i);
            System.out.println(evenOfTwo);
        }


    }
}