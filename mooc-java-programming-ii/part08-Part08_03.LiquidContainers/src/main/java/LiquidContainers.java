
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int content1 = 0;
        int content2 = 0;
        
        while (true) {
            System.out.println("First: " +content1 + "/100\n"
                    + "Second: " + content2 +"/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                String command = parts[0];
                int value = Integer.valueOf(parts[1]);
                
                if (command.equals("add")) {
                    if(value < 0) {
                        continue;
                    }
                    content1 += value;
                    if (content1 > 100) {
                        content1 = 100;
                    }
                } else if (command.equals("move")) {
                    if(content1 < value) {
                        value = content1;
                        content1 = 0;
                    }else {
                        content1 -= value;
                    }
                    content2 += value;
                    if(content2 > 100) {
                        content2 = 100;
                    }
                } else if (command.equals("remove")) {
                    if(content2 < value) {
                        content2 = 0;
                    } else {
                        content2 -= value;
                    }
                }
            }

        }
    }

}
