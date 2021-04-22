
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int content1 = 0;
        int content2 = 0;

        while (true) {
            System.out.println("First: " + content1 + "/100\n" + "Second: " + content2 + "/100");
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.contains(" ")) {
                String[] parts = input.split(" ");
                int value = Integer.valueOf(parts[1]);
                input = parts[0];

                if (input.equals("add")) {
                    if(value < 0) {
                        continue;
                    }
                    if (content1 + value >= 100) {
                        content1 = 100;
                    } else {
                        content1 += value;
                    }
                }

                if (input.equals("move")) {
                    if (value > content1) {
                        value = content1;
                    }
                    content1 -= value;
                    if (content2 + value > 100) {
                        content2 = 100;
                        continue;
                    }
                    content2 += value;
                    continue;

                }

                if (input.equals("remove")) {
                    if (content2 < value) {
                        content2 = 0;
                        System.out.println("First: " + content1 + "/100\n" + "Second: " + content2 + "/100");
                        continue;
                    }
                    content2 -= value;
                }
            }
            if (input.equals("quit")) {
                break;
            }
        }
    }

}
