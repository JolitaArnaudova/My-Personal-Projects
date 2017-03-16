import java.util.Scanner;

/**
 * Created by jolita on 14/03/2017.
 */
public class SoftUniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int countOfGroups = Integer.parseInt(scanner.nextLine());
        int totalCountOfPeople = 0;

        double typeCar = 0.00d;
        double typeMicroBus = 0.00d;
        double typeSmallBus = 0.00d;
        double typeBigBus = 0.00d;
        double typeTrain = 0.00d;

        for (int i = 0; i < countOfGroups ; i++) {
           int countOfPeopleInGroup = Integer.parseInt(scanner.nextLine());
            totalCountOfPeople += countOfPeopleInGroup;

            if (countOfPeopleInGroup <= 5) {

                typeCar += countOfPeopleInGroup;
            } else if (countOfPeopleInGroup <=12) {

                typeMicroBus += countOfPeopleInGroup;
            } else if (countOfPeopleInGroup <= 25) {

                typeSmallBus += countOfPeopleInGroup;
            } else if (countOfPeopleInGroup <=40) {

                typeBigBus += countOfPeopleInGroup;
            } else if (countOfPeopleInGroup >= 41) {

                typeTrain += countOfPeopleInGroup;
            }
        }
        double percentWithCar = typeCar/totalCountOfPeople * 100d;
        double percentWithMicroBus = typeMicroBus/totalCountOfPeople * 100d;
        double percentWithSmallBus = typeSmallBus/totalCountOfPeople * 100d;
        double percentWithBigBus = typeBigBus/totalCountOfPeople * 100d;
        double percentWithTrain = typeTrain/totalCountOfPeople * 100d;

        System.out.printf("%.2f%s %n", percentWithCar,"%");
        System.out.printf("%.2f%s %n", percentWithMicroBus, "%");
        System.out.printf("%.2f%s %n", percentWithSmallBus, "%");
        System.out.printf("%.2f%s %n", percentWithBigBus, "%");
        System.out.printf("%.2f%s %n", percentWithTrain, "%");


    }
}
