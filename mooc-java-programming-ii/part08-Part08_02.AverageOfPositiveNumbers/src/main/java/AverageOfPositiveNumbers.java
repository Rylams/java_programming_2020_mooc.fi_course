
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int i = 0;
        while (true) {
            int command = Integer.valueOf(scanner.nextLine());
            if (command == 0) {
                if (i == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(sum / i);
                    break;
                }

            }
            if (command > 0) {
                sum += command;
                i++;
            }
        }
    }
}
