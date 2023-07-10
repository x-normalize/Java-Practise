package WhileLoops;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double wantedProfit = Double.parseDouble(scanner.nextLine());
        double priceForOrders;
        double profit = 0;


        while (true) {
            String name = scanner.nextLine();
            if (name.equals("Party!")) {
                break;
            }

            int counterOrders = Integer.parseInt(scanner.nextLine());
            priceForOrders = name.length() * counterOrders;

            if (priceForOrders % 2 == 1) {
                priceForOrders = priceForOrders - (priceForOrders * 0.25);
            }
            profit += priceForOrders;


            if (profit >= wantedProfit) {
                break;
            }
        }

        if (profit >= wantedProfit) {
            System.out.print("Target acquired.\n");
            System.out.printf("Club income - %.2f leva.", profit);
        } else {
            double diff = Math.abs(profit - wantedProfit);
            System.out.printf("We need %.2f leva more.\n", diff);
            System.out.printf("Club income - %.2f leva.", profit);
        }


    }
}