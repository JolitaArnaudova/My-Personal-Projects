import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPriceVIP = people * 499.99d;
        double ticketPriceNormal = people * 249.99d;
        double transportationCosts;
        double budgetLeft = 0d;


        if ("Normal".equals(category)) {
            if (people < 5) {

                transportationCosts = 0.75d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceNormal);

            } else if (people <= 5 && people < 10) {

                transportationCosts = 0.6d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceNormal);

            } else if (people >= 10 && people < 25) {

                transportationCosts = 0.5d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceNormal);

            } else if (people >= 25 && people < 50) {

                transportationCosts = 0.25d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceNormal);
            }
            if(ticketPriceNormal > budgetLeft) {
                System.out.printf("Not enough money! You need %.2f leva.", budgetLeft);
            } else {
                System.out.println(budget - budgetLeft);
            }
        }
        if ("VIP".equals(category)) {
            if (people < 5) {

                transportationCosts = 0.75d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceVIP);

            } else if (people <= 5 && people < 10) {

                transportationCosts = 0.6d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceVIP);

            } else if (people >= 10 && people < 25) {

                transportationCosts = 0.5d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceVIP);

            } else if (people >= 25 && people < 50) {

                transportationCosts = 0.25d * budget;
                budgetLeft = budget - (transportationCosts + ticketPriceVIP);
            }
            if(ticketPriceNormal > budgetLeft) {
                System.out.printf("Not enough money! You need %.2f leva.", budgetLeft);
            } else {
                System.out.println((budget - ticketPriceVIP) - budgetLeft);
            }
        }

    }
}
