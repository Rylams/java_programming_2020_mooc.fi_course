
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command");
            String command = scanner.nextLine();
            
            if(command.equals("stop")) {
                break;
            }
            
            if(command.equals("add")) {
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                list.add(toAdd);
                continue;
            }
            
            if(command.equals("list")) {
                list.print();
            }
            
            if(command.equals("remove")) {
                System.out.println("Which one is removed?");
                int toRemove = Integer.valueOf(scanner.nextLine());
                list.remove(toRemove);
            }
        }
    }
}
