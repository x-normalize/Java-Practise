package ForLoops;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int intNumber = scanner.nextInt();
        double p1, p2, p3, p4, p5;
        p1 = 0;
        p2 = 0;
        p3 = 0;
        p4 = 0;
        p5 = 0;

        for (int i = 0; i < intNumber; i++) {
            int numbers = scanner.nextInt();

            if (numbers < 200) {
                p1 += 1;
            } else if (numbers <= 399) {
                p2 += 1;
            } else if (numbers <= 599) {
                p3 += 1;
            } else if (numbers <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }

        }
        p1 = p1 / intNumber * 100;
        p2 = p2 / intNumber * 100;
        p3 = p3 / intNumber * 100;
        p4 = p4 / intNumber * 100;
        p5 = p5 / intNumber * 100;
        System.out.printf("%n%.2f%%", p1);
        System.out.printf("%n%.2f%%", p2);
        System.out.printf("%n%.2f%%", p3);
        System.out.printf("%n%.2f%%", p4);
        System.out.printf("%n%.2f%%", p5);

    }
}
