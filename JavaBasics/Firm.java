import java.util.Scanner;

/**
 * Created by jolita on 09/03/2017.
 */
public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeed = Integer.parseInt(scanner.nextLine());
        int avaliableDays = Integer.parseInt(scanner.nextLine());
        int overTimeWorkers = Integer.parseInt(scanner.nextLine());

        double workdays = avaliableDays * 0.9;
        int overTime = overTimeWorkers * 2 * avaliableDays;
        int total = (int)(Math.floor(workdays * 8 + overTime));

        if(hoursNeed <= total) {
            System.out.println("Yes!" + Math.abs((hoursNeed-total)) + " hours left." );
        } else {
            System.out.println("Not enough time!" + Math.abs((total - hoursNeed)) + " hours needed.");
        }

    }
}
