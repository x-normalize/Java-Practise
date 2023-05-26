package ForLoops;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLily = scanner.nextInt();
        double washMachinePrice = scanner.nextDouble();
        int priceForOneToy = scanner.nextInt();
        int money = 0;
        int savedMoney = 0;
        int toyCounts = 0;
        int brotherMoney = 0;
        int toyPrice = 0;
        double totalMoneySaved = 0;

        for (int i = 1; i <= ageLily; i++) {
            if (i % 2 == 0) {
                savedMoney += 10;
                money = savedMoney + money;
                brotherMoney += 1;
            } else {
                toyCounts += 1;
                toyPrice = toyCounts * priceForOneToy;
            }

            totalMoneySaved = (money + toyPrice) - brotherMoney;
        }

        double diff = Math.abs(totalMoneySaved - washMachinePrice);
        if (totalMoneySaved >= washMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }


    }
}
