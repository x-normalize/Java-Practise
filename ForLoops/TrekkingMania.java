package ForLoops;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupsCount = Integer.parseInt(scanner.nextLine());
        int musala = 0;
        int montBlanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;
        int totalPeople = 0;

        for (int i = 1; i <= groupsCount; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            if (peopleCount <= 5) {
                musala += peopleCount;
            } else if (peopleCount <= 12) {
                montBlanc += peopleCount;
            } else if (peopleCount <= 25) {
                kilimanjaro += peopleCount;
            } else if (peopleCount <= 40) {
                k2 += peopleCount;
            } else {
                everest += peopleCount;
            }


            totalPeople = musala + montBlanc + kilimanjaro + k2 + everest;
        }

        System.out.printf("%n%.2f%%", (double) musala / totalPeople * 100);
        System.out.printf("%n%.2f%%", (double) montBlanc / totalPeople * 100);
        System.out.printf("%n%.2f%%", (double) kilimanjaro / totalPeople * 100);
        System.out.printf("%n%.2f%%", (double) k2 / totalPeople * 100);
        System.out.printf("%n%.2f%%", (double) everest / totalPeople * 100);


    }
}
