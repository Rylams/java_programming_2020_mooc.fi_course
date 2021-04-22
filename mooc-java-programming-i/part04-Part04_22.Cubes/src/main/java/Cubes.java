
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        while (true) {
            String value = scanner.nextLine();
            if (value.equals("end")) {
                break;
            }
            int valueOf = Integer.valueOf(value);
            System.out.println(valueOf * valueOf * valueOf);
        }
    }
}
