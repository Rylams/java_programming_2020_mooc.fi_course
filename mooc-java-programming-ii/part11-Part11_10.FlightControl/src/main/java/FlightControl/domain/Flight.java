package FlightControl.domain;

/**
 *
 * @author pedromaia
 */
public class Flight {
    private Airplane plane;
    private Place departure;
    private Place target;
    
    public Flight(Airplane plane, Place departure, Place target) {
        this.departure = departure;
        this.target = target;
        this.plane = plane;
    }

    public Place getDeparture() {
        return departure;
    }

    public Airplane getPlane() {
        return plane;
    }

    public Place getTarget() {
        return target;
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + departure.toString() + "-" + target.toString() + ")";
    }
}
