import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = scanner.nextDouble();
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();


        double goal = distance * time;
        double slowHim = Math.floor(distance / 50) * 30;

        double totalTime = goal + slowHim;
        double diff = Math.abs(totalTime - record);

        if (totalTime >= record) {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        } else {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTime);
        }
    }
}
