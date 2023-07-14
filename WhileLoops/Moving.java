package WhileLoops;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int total = width * length * height;

        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            total -= boxes;

            if (total <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(total));
                break;
            }

            input = scanner.nextLine();
        }
        if (total >= 0) {
            System.out.printf("%d Cubic meters left.", total);
        }
    }
}
