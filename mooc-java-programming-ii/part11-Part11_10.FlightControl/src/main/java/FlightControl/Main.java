package FlightControl;
import java.util.Scanner;
import FlightControl.ui.TextInterface;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextInterface ui = new TextInterface(scanner);
        
        ui.start();
    }
}
