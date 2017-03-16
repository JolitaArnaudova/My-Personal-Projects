import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        if ("May".equals(month) || "October".equals(month)) {
            if (days >= 7 && days < 14) {
                double totalPriceApartment = 65 * days;

                double discount = 50 * 0.05d;

                double totalPriceStudio = Math.abs((50 - discount) * days);

                System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                System.out.printf("Studio: %.2f %s" , totalPriceStudio, "lv.");
            } else if (days >= 14) {

                double discountApartment = 65 * 0.1d;

                double totalPriceApartment = Math.abs((65 - discountApartment) * days);

                double discountStudio = 50 * 0.3d;

                double totalPriceStudio = Math.abs((50 - discountStudio) * days);

                System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                System.out.printf("Studio: %.2f %s" , totalPriceStudio, "lv.");
            }
        }
            if ("June".equals(month) || "September".equals(month)) {
                if (days >= 7 && days < 14) {

                    double discount = 65 * 0.1d;

                    double totalPriceApartment = Math.abs((65 - discount) * days);

                    double totalPriceStudio = 75.2 * days;

                    System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                    System.out.printf("Studio: %.2f %s" , totalPriceStudio, "lv.");
                } else if (days >= 14) {

                    double totalPriceApartment = 68.7 * days;

                    double discount = 75.2 * 02.d;

                    double totalPriceStudio = Math.abs((75.20 - discount) * days);

                    System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                    System.out.printf("Studio: %.2f %s" , totalPriceStudio, "lv.");
                } else if(days > 14) {

                    double discount = 68.70 * 0.1d;

                    double totalPriceApartment = Math.abs((68.70 - discount) * days);

                    System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                }
            }
            if("July".equals(month) || "August".equals(month)) {
                if(days > 14) {

                    double discount = 77 * 0.1d;

                    double totalPriceApartment = Math.abs((77 - discount) * days);

                    double totalPriceStudio = 76 * days;

                    System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                    System.out.printf("Studio: %.2f %s" , totalPriceStudio, "lv.");

                } else {

                    double totalPriceApartment = 77 * days;

                    double totalPriceStudio = 76 * days;

                    System.out.printf("Apartment: %.2f %s %n" , totalPriceApartment, "lv.");
                    System.out.printf("Studio: %.2f %s" , totalPriceStudio, "lv.");
                }
            }
        }
    }

