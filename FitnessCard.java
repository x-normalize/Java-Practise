import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;


        if (gender.equals("m") && sport.equals("Gym")) {
            price = 42;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("m") && sport.equals("Boxing")) {
            price = 41;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }

        } else if (gender.equals("m") && sport.equals("Yoga")) {
            price = 45;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("m") && sport.equals("Zumba")) {
            price = 34;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("m") && sport.equals("Dances")) {
            price = 51;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("m") && sport.equals("Pilates")) {
            price = 39;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        }
        if (gender.equals("f") && sport.equals("Gym")) {
            price = 35;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("f") && sport.equals("Boxing")) {
            price = 37;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("f") && sport.equals("Yoga")) {
            price = 42;
            if (age <= 19) {
                price = price + (price * 0.20);
            }
            if (money < price) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs((price - money - 16.80)));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("f") && sport.equals("Zumba")) {
            price = 31;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("f") && sport.equals("Dances")) {
            price = 53;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        } else if (gender.equals("f") && sport.equals("Pilates")) {
            price = 37;
            if (age <= 19) {
                price = price * 0.20;
            }
            if (price > money) {
                System.out.printf("You don't have enough money! You need $%.2f more.", Math.abs(price - money));
            } else {
                System.out.printf("You purchased a 1 month pass for %s.", sport);
            }
        }
    }
}