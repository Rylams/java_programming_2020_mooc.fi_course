
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String command = scanner.nextLine();
            
            if(command.equals("end")) {
                break;
            } else {
                int value = Integer.valueOf(command);
                int sum = value * value * value;
                System.out.println(sum);
            }
        }
    }
}
