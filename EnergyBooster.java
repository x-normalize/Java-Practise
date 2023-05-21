import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String setSize = scanner.nextLine();
        int orderSets = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double bigSets = 5;
        double smallSets = 2;
        double discount = 0;

        if (setSize.equals("big")) {
            switch (fruit) {
                case "Watermelon":
                    price = bigSets * 28.70 * orderSets;
                    break;
                case "Mango":
                    price = bigSets * 19.60 * orderSets;
                    break;
                case "Pineapple":
                    price = bigSets * 24.80 * orderSets;
                    break;
                case "Raspberry":
                    price = bigSets * 15.20 * orderSets;
                    break;
            }
        } else if (setSize.equals("small")) {
            switch (fruit) {
                case "Watermelon":
                    price = smallSets * 56 * orderSets;
                    break;
                case "Mango":
                    price = smallSets * 36.66 * orderSets;
                    break;
                case "Pineapple":
                    price = smallSets * 42.10 * orderSets;
                    break;
                case "Raspberry":
                    price = smallSets * 20 * orderSets;
                    break;
            }
        }

        if (price >= 400 && price <= 1000) {
            discount = price * 0.15;
        } else if (price > 1000) {
            discount = price * 0.50;
        }

        price -= discount;

        System.out.printf("%.2f lv.", price);
    }
}