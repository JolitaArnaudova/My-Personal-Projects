import java.util.Scanner;

/**
 * Created by jolita on 13/03/2017.
 */
public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double skumria = Double.parseDouble(scanner.nextLine());
        double caca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafridi = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud = skumria + skumria * 0.6d;
        double sumPalamud = kgPalamud * pricePalamud;
        double priceSafrid = caca + caca * 0.8d;
        double sumSafrid = kgSafridi * priceSafrid;
        double priceMidi = kgMidi * 7.5d;

        double sumTotal = sumPalamud + sumSafrid + priceMidi;

        System.out.printf("%.2f",sumTotal);
    }
}
