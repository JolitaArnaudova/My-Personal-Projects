import java.util.Scanner;

/**
 * Created by jolita on 16/03/2017.
 */
public class Pr02FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count1 = Integer.parseInt(scanner.nextLine());
        int count2 = Integer.parseInt(scanner.nextLine());
        int count3 = Integer.parseInt(scanner.nextLine());
        int count4 = Integer.parseInt(scanner.nextLine());
        double amountMoney = Double.parseDouble(scanner.nextLine());

        double sum = (count1 * 3.25d) + (count2 * 4d) + (count3 * 3.5d) + (count4 * 8d);
        double taxes = 0.05d * sum;
        double total = sum - taxes;
        int diff = (int) Math.abs(Math.ceil(amountMoney - total));

        if(amountMoney > total) {
            System.out.printf("She will have to borrow %s leva.", diff);
        } else if (amountMoney < total){
            System.out.printf("She is left with %s leva.",diff);

        }




    }
}
