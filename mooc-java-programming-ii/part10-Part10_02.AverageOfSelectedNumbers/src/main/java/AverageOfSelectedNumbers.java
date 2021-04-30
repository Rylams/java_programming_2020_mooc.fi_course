
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String select;

        while (true) {
            System.out.println("Input numbers, type 'end' to stop.");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                select = scanner.nextLine();
                break;
            }

            list.add(input);
        }

        if (select.equals("n")) {
            double averageN = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + averageN);
        }
        
        if (select.equals("p")) {
            double averageP = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + averageP);
        }
    }
}
