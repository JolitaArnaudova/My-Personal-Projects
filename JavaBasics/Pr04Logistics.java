import java.util.Scanner;

/**
 * Created by jolita on 16/03/2017.
 */
public class Pr04Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfBaggage = Integer.parseInt(scanner.nextLine());
        double totalCountOfBaggage = 0.00d;

        double typeMicroBus = 0.00d;
        double typeCamion = 0.00d;
        double typeTrain = 0.00d;

        for (int i = 0; i < countOfBaggage ; i++) {

            int weightOfSingleBaggage = Integer.parseInt(scanner.nextLine());

            totalCountOfBaggage += weightOfSingleBaggage;

            if(weightOfSingleBaggage <= 3) {

                typeMicroBus += weightOfSingleBaggage;
            } else if(weightOfSingleBaggage <= 11) {

                typeCamion += weightOfSingleBaggage;
            } else if(weightOfSingleBaggage >= 12) {

                typeTrain += weightOfSingleBaggage;
            }
        }
        double avgPrice = (typeMicroBus * 200.0d + typeCamion * 175.0d + typeTrain * 120.0d) / totalCountOfBaggage;

        double percent = totalCountOfBaggage / 100.0d;

        double percentWithMicroBus = typeMicroBus/percent;
        double percentWithCamion = typeCamion/percent;
        double percentWithTrain = typeTrain/percent;

        System.out.printf("%.2f%n", avgPrice);
        System.out.printf("%.2f%s%n", percentWithMicroBus, "%");
        System.out.printf("%.2f%s%n", percentWithCamion, "%");
        System.out.printf("%.2f%s", percentWithTrain, "%");

    }
}
