
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        while (true) {
            System.out.println("?");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                System.out.println("Name: ");
                String name = scan.nextLine();
                System.out.println("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.add(new Bird(name, latinName));
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                birdObs(birds, name);
            }

            if (command.equals("All")) {
                for(Bird bird: birds) {
                    System.out.println(bird);
                }
            }

            if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                boolean found = false;
                for(Bird bird: birds) {
                    if(bird.getName().contains(name)){
                        System.out.println(bird);
                        found = true;
                    }
                }
                if(found == false) {
                    System.out.println("Not a bird!");
                }
            }

            if (command.equals("Quit")) {
                break;
            }

        }

    }

    public static void birdObs(ArrayList<Bird> birds, String name) {
        boolean found = false;
        for (Bird bird : birds) {
            if (bird.getName().contains(name)) {
                bird.Observation();
                found = true;
            }
        }
        if(found == false) {
            System.out.println("Not a bird!");
        }
    }

}
