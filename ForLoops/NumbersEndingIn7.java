package ForLoops;

import java.util.Scanner;

public class NumbersEndingIn7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = 7;

        for (int counter = startNumber; counter <= 1000; counter += 10) {
            System.out.println(counter);
        }

    }
}
