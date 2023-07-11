package WhileLoops;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namePlayer = scanner.nextLine();


        int counterShot = 0;
        int startPoints = 301;
        int badShouts = 0;

        String command = scanner.nextLine();
        boolean isWinner = false;

        while (true) {

            int points = Integer.parseInt(scanner.nextLine());

            if (command.equals("Triple")) {
                points *= 3;
                counterShot++;
            } else if (command.equals("Double")) {
                points *= 2;
                counterShot++;
            } else {
                counterShot++;
            }

            startPoints -= points;


            if (startPoints > points) {
                badShouts ++;
                continue;
            }

            if (command.equals("Retire")) {
                break;
            }

            if(startPoints == 0){
                isWinner = true;
                break;
            }

            command = scanner.nextLine();

        }
        if (command.equals("Retire")) {
            System.out.printf("%s retired after %d unsuccessful shots.", namePlayer, badShouts);
        }

        if (isWinner){
            System.out.printf("%s won the leg with %d shots.", namePlayer, counterShot);
        }
    }
}
