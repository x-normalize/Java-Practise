import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggCount = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        int eggSold = 0;
        boolean isNotEnough = false;


        while (!command.equals("Close")) {
            int numberOfEggs = Integer.parseInt(scanner.nextLine());

            if (command.equals("Buy")) {
                if (numberOfEggs > eggCount) {
                    isNotEnough = true;
                    break;
                } else {
                    eggCount -= numberOfEggs;
                    eggSold += numberOfEggs;
                }
            } else if (command.equals("Fill")) {
                eggCount += numberOfEggs;
            }


            command = scanner.nextLine();
        }

        if (isNotEnough) {
            System.out.print("Not enough eggs in store!\n");
            System.out.printf("You can buy only %d.", Math.abs(eggSold));

        }
        if (command.equals("Close")) {
            System.out.print("Store is closed!\n");
            System.out.printf("%d eggs sold.", eggSold);
        }


    }
}
