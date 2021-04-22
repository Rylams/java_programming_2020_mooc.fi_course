
import java.util.Scanner;
import java.util.Objects;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int inputs = -1;
        while (true) {
            String input = scanner.nextLine();
            inputs++;
            if (Objects.equals(input, "end")) {
                break;
            }
        }
        System.out.println(inputs);

    }
}
