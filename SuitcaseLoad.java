import java.util.Scanner;

public class SuitcaseLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double freeSpaceTotal = Double.parseDouble(scanner.nextLine());
        int loadedSuitcase = 0;
        double total = 0;

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            double valueSuitcase = Double.parseDouble(command);
            total += valueSuitcase;
            loadedSuitcase++;



            if(valueSuitcase < freeSpaceTotal){
                freeSpaceTotal -= valueSuitcase;
            }

            if(total > freeSpaceTotal){
                System.out.print("No more space!");
                System.out.printf("Statistic: %d suitcases loaded.", loadedSuitcase);
                break;

            }






            command = scanner.nextLine();


        }

        if (command.equals("End")) {
            System.out.print("Congratulations! All suitcases are loaded!\n");
            System.out.printf("Statistic: %d suitcases loaded.", loadedSuitcase);
        }

    }
}
