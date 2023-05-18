import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double bit = bitcoins * 1168;
        double yuan = chineseYuan * 0.15;
        double usd = 1.76;
        double euro = 1.95;

        double yuanForBg = yuan * usd;
        double total = (bit + yuanForBg) / euro;
        double commission = percent * total / 100;
        double totalResult = total - commission;

        System.out.printf("%.2f",totalResult);

    }
}
