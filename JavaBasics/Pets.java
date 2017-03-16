import java.util.Scanner;

/**
 * Created by jolita on 13/03/2017.
 */
public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int kgTotalFood = Integer.parseInt(scanner.nextLine());
        double kgFoodPerDayForDog = Double.parseDouble(scanner.nextLine());
        double kgFoodPerDayForCat = Double.parseDouble(scanner.nextLine());
        double grFoodPerDayForTurtle = Double.parseDouble(scanner.nextLine());

        double foodForDog = days * kgFoodPerDayForDog;
        double foodForCat = days * kgFoodPerDayForCat;
        double foodForTurtle = (days * grFoodPerDayForTurtle) / 1000.0d;

        double sumFood = foodForCat + foodForDog + foodForTurtle;

        if(sumFood < kgTotalFood) {
            int left = (int)Math.floor(kgTotalFood - sumFood);
            System.out.println(left + " kilos of food left.");
        } else if(sumFood > kgTotalFood) {
            int  needed = (int)Math.ceil(sumFood - kgTotalFood);
            System.out.println(needed + " more kilos of food are needed.");
        }
    }
}
