import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double rent = scanner.nextDouble();

        double cake = rent * 0.20;
        double drinks = cake - (cake * 0.45);
        double animator = rent / 3;

        double totalSum = rent + cake + drinks + animator;

        System.out.println(totalSum);
    }
}
