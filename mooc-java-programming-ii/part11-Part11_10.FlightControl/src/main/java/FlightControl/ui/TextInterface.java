package FlightControl.ui;

import java.util.Scanner;
import FlightControl.logic.FlightControl;
import FlightControl.domain.Flight;
import FlightControl.domain.Airplane;

/**
 *
 * @author pedromaia
 */
public class TextInterface {

    private Scanner scanner;
    private FlightControl flightcontrol;

    public TextInterface(Scanner scanner) {
        this.scanner = scanner;
        this.flightcontrol = new FlightControl();
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.
                println();
    }

    public void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {

                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();

                System.out.println("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());

                flightcontrol.addAirplane(id, capacity);
            }

            if (input.equals("2")) {

                System.out.println("Give the airplane id: ");
                String id = scanner.nextLine();

                System.out.println("Give the departure airport id: ");
                String departure = scanner.nextLine();

                System.out.println("Give the target airport id: ");
                String target = scanner.nextLine();

                flightcontrol.addFlight(id, departure, target);
            }
        }

    }

    public void startFlightControl() {

        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while (true) {

            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            System.out.print("> ");
            String input = scanner.nextLine();

            if (input.equals("x")) {
                break;
            }

            if (input.equals("1")) {
                for (Airplane plane : flightcontrol.getPlanes()) {
                    System.out.println(plane);
                }
            }

            if (input.equals("2")) {
                for (Flight flight : flightcontrol.getFlights()) {
                    System.out.println(flight);
                    System.out.println("");
                }
            }

            if (input.equals("3")) {
                System.out.print("Give the airplane id: ");
                Airplane plane = askForAirplane();
                System.out.println(plane);
                System.out.println();
            }
        }
    }

    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightcontrol.getPlane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }
}
