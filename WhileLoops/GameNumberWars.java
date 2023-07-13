package WhileLoops;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayerName = scanner.nextLine();
        String secondPlayerName = scanner.nextLine();
        String command = scanner.nextLine();
        int scoreFirstPlayer = 0;
        int scoreSecondPlayer = 0;
        boolean firstWin = false;
        boolean numberWars = false;

        while (!command.equals("End of game")) {
            int firstPlayerCards = Integer.parseInt(command);
            command = scanner.nextLine();
            int secondPlayerCards = Integer.parseInt(command);

            if (firstPlayerCards > secondPlayerCards) {
                int score = firstPlayerCards - secondPlayerCards;
                scoreFirstPlayer += score;
            } else if (secondPlayerCards > firstPlayerCards) {
                int score = secondPlayerCards - firstPlayerCards;
                scoreSecondPlayer += score;
            } else {
                numberWars = true;
                firstPlayerCards = Integer.parseInt(scanner.nextLine());
                secondPlayerCards = Integer.parseInt(scanner.nextLine());
                if (firstPlayerCards > secondPlayerCards) {
                    firstWin = true;
                }
                break;
            }

            if (scoreFirstPlayer > scoreSecondPlayer) {
                firstWin = true;
            }

            command = scanner.nextLine();

        }
        if (numberWars) {
            System.out.println("Number wars!");
            if (firstWin) {
                System.out.printf("%s is winner with %d points", firstPlayerName, scoreFirstPlayer);
            } else {
                System.out.printf("%s is winner with %d points", secondPlayerName, scoreSecondPlayer);
            }


        }
        if (command.equals("End of game")) {
            System.out.printf("%s has %d points\n", firstPlayerName, scoreFirstPlayer);
            System.out.printf("%s has %d points", secondPlayerName, scoreSecondPlayer);
        }


    }
}
