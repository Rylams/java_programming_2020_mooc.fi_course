
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        JokeManager jokes = new JokeManager();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(jokes, scanner);
        
        ui.start();
    }
}
