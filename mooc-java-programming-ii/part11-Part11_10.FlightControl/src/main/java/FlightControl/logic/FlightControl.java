package FlightControl.logic;

import java.util.HashMap;
import java.util.Scanner;
import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;
import java.util.Collection;
/**
 *
 * @author pedromaia
 */
public class FlightControl {

    private Scanner scanner;
    private HashMap<String, Airplane> planes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    public FlightControl() {
        this.planes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        planes.putIfAbsent(plane.getID(), plane);
    }
    
    public void addFlight(String planeID, String departure, String target) {
        places.putIfAbsent(target, new Place(target));
        places.putIfAbsent(departure, new Place(departure));
        
        Flight flight = new Flight(planes.get(planeID), places.get(departure), places.get(target));
        flights.putIfAbsent(flight.toString(), flight);
    }

    public Airplane getPlane(String ID) {
        return this.planes.get(ID);
    }

    public Collection<Airplane> getPlanes() {
        return this.planes.values();
    }
    
    public Collection<Flight> getFlights() {
        return this.flights.values();
    }
    
    
}
