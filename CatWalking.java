import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalk = scanner.nextInt();
        int numberOfWalksDaily = scanner.nextInt();
        int foodEatByTheCat = scanner.nextInt();


        double totalMinutes = minutesWalk * numberOfWalksDaily;
        double totalBurnCalories = totalMinutes * 5;
        double result = foodEatByTheCat * 0.5;

        if (totalBurnCalories >= result) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", totalBurnCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", totalBurnCalories);
        }
    }
}
