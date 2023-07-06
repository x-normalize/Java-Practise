package ForLoops;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'a') {
                sum += 1;
            } else if (ch == 'e') {
                sum += 2;
            } else if (ch == 'i') {
                sum += 3;
            } else if (ch == 'o') {
                sum += 4;
            } else if (ch == 'u') {
                sum += 5;
            }

//            switch (ch) {
//                case 'a':
//                    sum += 1;
//                    break;
//                case 'e':
//                    sum += 2;
//                    break;
//                case 'i':
//                    sum += 3;
//                    break;
//                case 'o':
//                    sum += 4;
//                    break;
//                case 'u':
//                    sum += 5;
//                    break;
//                default:
//                    break;
        }
        System.out.println(sum);
    }
}

