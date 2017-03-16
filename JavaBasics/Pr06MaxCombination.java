import java.util.Scanner;

/**
 * Created by jolita on 16/03/2017.
 */
public class Pr06MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int maxNumberOfCombos = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int num1 = start; num1 <= end; num1++) {
            if(counter >= maxNumberOfCombos) {
                break;
            }
            for (int num2 = start; num2 <= end ; num2++) {
                if(counter >= maxNumberOfCombos) {
                    break;
                }
                System.out.printf("<%s-%s>",num1,num2);
                counter++;
            }
        }
    }
}