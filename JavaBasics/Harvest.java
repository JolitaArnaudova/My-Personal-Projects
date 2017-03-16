import java.util.Scanner;

/**
 * Created by jolita on 11/03/2017.
 */
public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int litersNeeded = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());

        int totalAmountGrapes = (int)(area * grapesPerSquareMeter);
        int wineProduced = (int)(Math.round((0.4d * totalAmountGrapes) / 2.5d));
        int wineLeft = Math.abs(Math.round(litersNeeded - wineProduced));
        int wineLeftForWorkers = wineLeft / countOfWorkers;

        if(wineProduced >= litersNeeded) {

            System.out.println("Good harvest this year! Total wine: " + wineProduced + " liters.");

            System.out.println(wineLeft + " liters left -> " + wineLeftForWorkers + " liters per person.");
        } else if(wineProduced < litersNeeded){

            System.out.println("It will be a tough winter! More " + wineLeft + " liters wine needed.");
        }

    }
}
