
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SimpleDictionary book = new SimpleDictionary();
        Scanner scanner = new Scanner(System.in);
        
        TextUI ui = new TextUI(scanner, book);
        ui.start();
        
    }
}
