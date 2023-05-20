import java.util.Scanner;

public class EggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstPlayerEgg = Integer.parseInt(scanner.nextLine());
        int secondPlayerEgg = Integer.parseInt(scanner.nextLine());


        String command = scanner.nextLine();

        while (!command.equals("End")) {

            if (command.equals("one")) {
                secondPlayerEgg--;
            } else {
                firstPlayerEgg--;
            }

            if (firstPlayerEgg <= 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.", secondPlayerEgg);
                break;
            }else if (secondPlayerEgg <= 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", firstPlayerEgg);
                break;
            }


            command = scanner.nextLine();
        }

        if (command.equals("End")) {
            System.out.printf("Player one has %d eggs left.\n", firstPlayerEgg);
            System.out.printf("Player two has %d eggs left.", secondPlayerEgg);
        }

    }
}


