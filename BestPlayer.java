import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int goals = 0;
        String bestPlayer = "";



        while (!input.equals("END")) {
            int goalsCounter = Integer.parseInt(scanner.nextLine());

            if (goalsCounter > goals){
                goals = goalsCounter;
                bestPlayer = input;
            }

            if (goals >= 10) {
                break;
            }


            input = scanner.nextLine();
        }

        System.out.printf("%s is the best player!\n", bestPlayer);
        if (goals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", goals);
        }else{
            System.out.printf("He has scored %d goals.", goals);
        }


    }
}
