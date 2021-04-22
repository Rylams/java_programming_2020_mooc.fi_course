
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container container1 = new Container();
        Container container2 = new Container();
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + container1.toString() + "\n" + "Second: " + container2.toString());
            System.out.print("> ");
            
            String input = scan.nextLine();
            
            if (input.contains(" ")) {
                String[] parts = input.split(" ");
                int value = Integer.valueOf(parts[1]);
                input = parts[0];

                if (input.equals("add")) {
                    container1.add(value);
                    continue;
                }

                if (input.equals("move")) {
                    if(container1.getContent() < value) {
                        value = container1.getContent();
                    }
                    container1.remove(value);
                    container2.add(value);
                    continue;
                }

                if (input.equals("remove")) {
                    container2.remove(value);
                    continue;
                }
            }
            
            if (input.equals("quit")) {
                break;
            }

        }
    }

}
