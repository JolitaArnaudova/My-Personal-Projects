import java.util.Scanner;

/**
 * Created by jolita on 09/03/2017.
 */
public class DailyGain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workDaysPerMonth =Integer.parseInt(scanner.nextLine());
        double gainPerDay = Double.parseDouble(scanner.nextLine());
        double dollarToLeva = Double.parseDouble(scanner.nextLine());

        double monthlyPay = (workDaysPerMonth * gainPerDay);
        double yearlyPay = (monthlyPay * 12) + (monthlyPay * 2.5);
        double tax = (yearlyPay * 0.25d);
        double averageGainPerDayInDollars = (yearlyPay - tax);
        double averageGainPerDayInLeva = (averageGainPerDayInDollars*dollarToLeva)/365;

        System.out.printf("%.2f",averageGainPerDayInLeva);
    }
}
