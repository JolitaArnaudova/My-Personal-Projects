import java.util.Scanner;

/**
 * Created by jolita on 16/03/2017.
 */
public class Pr03BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJuniors = Integer.parseInt(scanner.nextLine());
        int countSeniors = Integer.parseInt(scanner.nextLine());
        String racingType = scanner.nextLine();

        double totalPrice;
        double costs;
        double left;
        double crossDiscountJuniors = 8d - (0.25d * 8d);
        double crossDiscountSeniors = 9.5d - (0.25d * 9.5d);

        switch(racingType) {
            case "trail":
                totalPrice = (countJuniors * 5.5d) + (countSeniors * 7d);
                costs = totalPrice * 0.05d;
                left = totalPrice - costs;
                System.out.printf("%.2f",left);
                break;
            case "cross-country":
                if((countJuniors + countSeniors) >= 50) {
                    totalPrice = (countJuniors * crossDiscountJuniors) + (countSeniors * crossDiscountSeniors);
                    costs = totalPrice * 0.05d;
                    left = totalPrice - costs;
                    System.out.printf("%.2f",left);
                }
                totalPrice = (countJuniors * 8d) + (countSeniors * 9.50d);
                costs = totalPrice * 0.05d;
                left = (totalPrice - costs) / 100000;
                System.out.printf("%.2f",left);
                break;
            case "downhill":
                totalPrice = (countJuniors * 12.25d) + (countSeniors * 13.75d);
                costs = totalPrice * 0.05d;
                left = totalPrice - costs;
                System.out.printf("%.2f",left);
                break;
            case "road":
                totalPrice = (countJuniors * 20d) + (countSeniors * 21.50d);
                costs = totalPrice * 0.05d;
                left = totalPrice - costs;
                System.out.printf("%.2f",left);
                break;
        }
    }
}
