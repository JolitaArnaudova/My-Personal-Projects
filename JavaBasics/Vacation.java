import java.util.Scanner;

/**
 * Created by jolita on 14/03/2017.
 */
public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adults = Integer.parseInt(scanner.nextLine());
        int pupils = Integer.parseInt(scanner.nextLine());
        int countNights = Integer.parseInt(scanner.nextLine());
        String typeOfTransportation = scanner.nextLine();

        double totalPrice;
        double priceHotel = 82.99d * countNights;
        double totalPriceTransportation;
        double commission;

        switch(typeOfTransportation) {
            case "train":
                totalPriceTransportation = 2*(adults * 24.99d + pupils * 14.99);
                commission = (totalPriceTransportation + priceHotel) * 0.1d;
                totalPrice = totalPriceTransportation + priceHotel + commission;
                System.out.printf("%.2f",totalPrice);
                if(adults + pupils > 50) {
                    double totalPriceTransportationDiscount = (2*(adults * 24.99d + pupils * 14.99)) * 0.5d;
                    totalPrice = (totalPriceTransportation - totalPriceTransportationDiscount) + priceHotel + commission;
                    System.out.printf("%.2f", totalPrice);
                }
                break;
            case "bus":
                totalPriceTransportation = 2*(adults * 32.50d + pupils * 28.50d);
                commission = (totalPriceTransportation + priceHotel) * 0.1d;
                totalPrice = totalPriceTransportation + priceHotel + commission;
                System.out.printf("%.2f",totalPrice);
                break;
            case "boat":
                totalPriceTransportation = 2*(adults * 42.99d + pupils * 39.99d);
                commission = (totalPriceTransportation + priceHotel) * 0.1d;
                totalPrice = totalPriceTransportation + priceHotel + commission;
                System.out.printf("%.2f",totalPrice);
                break;
            case "airplane":
                totalPriceTransportation = 2*(adults * 70.00d + pupils * 50.00d);
                commission = (totalPriceTransportation + priceHotel) * 0.1d;
                totalPrice = totalPriceTransportation + priceHotel + commission;
                System.out.printf("%.2f",totalPrice);
                break;
        }

    }
}
