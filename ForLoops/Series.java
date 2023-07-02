package ForLoops;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int seriesCount = Integer.parseInt(scanner.nextLine());
        double totalMoney = 0;

        for (int i = 1; i <= seriesCount; i++) {
            String nameSeries = scanner.nextLine();
            double priceSeries = Double.parseDouble(scanner.nextLine());

            if (nameSeries.equals("Thrones")) {
                priceSeries = priceSeries - (priceSeries * 0.5);
            } else if (nameSeries.equals("Lucifer")) {
                priceSeries = priceSeries - (priceSeries * 0.4);
            } else if (nameSeries.equals("Protector")) {
                priceSeries = priceSeries - (priceSeries * 0.3);
            } else if (nameSeries.equals("TotalDrama")) {
                priceSeries = priceSeries - (priceSeries * 0.2);
            } else if (nameSeries.equals("Area")) {
                priceSeries = priceSeries - (priceSeries * 0.1);
            }

            totalMoney += priceSeries;


        }

        double diff = Math.abs(budget - totalMoney);

        if (budget >= totalMoney) {
            System.out.printf("You bought all the series and left with %.2f lv.", diff);
        }else {
            System.out.printf("You need %.2f lv. more to buy the series!", diff);
        }

    }
}
