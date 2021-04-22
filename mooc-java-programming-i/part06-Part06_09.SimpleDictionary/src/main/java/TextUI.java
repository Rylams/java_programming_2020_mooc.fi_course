
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary book;

    public TextUI(Scanner scanner, SimpleDictionary book) {
        this.scanner = scanner;
        this.book = book;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.book.add(word, translation);
                continue;
            }

            if (command.equals("search")) {
                System.out.println("To be translated:");
                String toTranslate = scanner.nextLine();
                if (book.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                    continue;
                } else {
                    System.out.println("Translantion: " + book.translate(toTranslate));
                    continue;
                }
            }

            System.out.println("Unknown command");
        }
    }

}
