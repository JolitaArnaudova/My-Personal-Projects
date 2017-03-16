import java.util.Scanner;

/**
 * Created by jolita on 14/03/2017.
 */
public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentCount = Integer.parseInt(scanner.nextLine());
        double grade5 = 0;
        double grade4 = 0;
        double grade3 = 0;
        double grade2 = 0;
        double totalGrade = 0d;

        for (int i = 0; i < studentCount ; i++) {

            double currentGrade = Double.parseDouble(scanner.nextLine());
            totalGrade += currentGrade;

            if(currentGrade >= 5d) {
                grade5++;
            } else if (currentGrade >= 4d) {
                grade4++;
            } else if(currentGrade >= 3d) {
                grade3++;
            } else if(currentGrade < 3d) {
                grade2++;
            }
        }
        double avgGrade = totalGrade/studentCount;

        double percentGrade5 = (grade5/studentCount) * 100d;
        double percentGrade4 = (grade4/studentCount) * 100d;
        double percentGrade3 = (grade3/studentCount) * 100d;
        double percentGrade2 = (grade2/studentCount) * 100d;

        System.out.printf("Top students: %.2f%%%n", percentGrade5);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentGrade4);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentGrade3);
        System.out.printf("Fail: %.2f%%%n", percentGrade2);

        System.out.printf("Average: %.2f ", avgGrade);

    }
}
