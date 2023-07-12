package WhileLoops;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        int lowGrades = 0;
        int countGrades = 0;
        int totalGrades = 0;
        double averageScore = 0;
        String lastProblem = "";

        while (lowGrades < badGrades) {
            String nameTask = scanner.nextLine();
            if (nameTask.equals("Enough")) {
                System.out.printf("Average score: %.2f\n", averageScore);
                System.out.printf("Number of problems: %d\n", countGrades);
                System.out.printf("Last problem: %s\n", lastProblem);
                break;
            }

            int grades = Integer.parseInt(scanner.nextLine());
            lastProblem = nameTask;
            countGrades++;
            totalGrades += grades;
            averageScore = (double) totalGrades / countGrades;


            if (grades <= 4) {
                lowGrades++;
            }

            if (lowGrades == badGrades) {
                System.out.printf("You need a break, %d poor grades.", lowGrades);
                break;
            }


        }
    }
}

