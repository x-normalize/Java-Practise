package ForLoops;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int judgeCount = Integer.parseInt(scanner.nextLine());
        double totalPoints = 0;

        for (int i = 1; i <= judgeCount; i++) {
            String nameJudge = scanner.nextLine();
            double pointsFromJudge = Double.parseDouble(scanner.nextLine());

            pointsFromAcademy += (nameJudge.length() * pointsFromJudge) / 2;
            totalPoints = pointsFromAcademy;

            if (totalPoints > 1250.5) {
                break;
            }

        }
        if (totalPoints > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, totalPoints);
        } else {
            double diff = Math.abs(totalPoints - 1250.5);
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, diff);
        }


    }
}
