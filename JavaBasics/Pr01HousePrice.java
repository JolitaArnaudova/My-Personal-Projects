import java.util.Scanner;

/**
 * Created by jolita on 16/03/2017.
 */
public class Pr01HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaOfSmallestRoom = Double.parseDouble(scanner.nextLine());
        double areaOfKitchen = Double.parseDouble(scanner.nextLine());
        double pricePerSquareMeter = Double.parseDouble(scanner.nextLine());

        double areaOfBathroom = areaOfSmallestRoom/2;
        double areaOfSecondRoom = areaOfSmallestRoom + (areaOfSmallestRoom * 0.1d);
        double areaOfThirdRoom = areaOfSecondRoom + (areaOfSecondRoom * 0.1d);
        double totalArea  = 0.05d * (areaOfSmallestRoom + areaOfKitchen + areaOfBathroom +
                             areaOfSecondRoom + areaOfThirdRoom) + (areaOfSmallestRoom +
                             areaOfKitchen + areaOfBathroom +
                             areaOfSecondRoom + areaOfThirdRoom);
        double totalPrice = pricePerSquareMeter * totalArea;

        System.out.printf("%.2f", totalPrice);

    }
}
