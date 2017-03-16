import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         double taskResult = 569.668717948718;

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsToLeva = bitcoins * 1168.0;
        double yuanToDollars = yuans * 0.15d;
        double dollarsToLeva = yuanToDollars * 1.76d;
        double totalLeva = bitcoinsToLeva + dollarsToLeva;
        double levaToEuros = totalLeva / 1.95d;
        double commissionOnEuroSum = (commission / 100.00d) * levaToEuros ;
        double result = levaToEuros - commissionOnEuroSum;


        System.out.println(result);
    }
}
