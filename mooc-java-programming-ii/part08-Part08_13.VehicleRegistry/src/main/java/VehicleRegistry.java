
/**
 *
 * @author pedromaia
 */
import java.util.HashMap;
import java.util.Objects;
import java.util.ArrayList;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> list;

    public VehicleRegistry() {
        this.list = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!list.containsKey(licensePlate)) {
            list.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate) {
        return list.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (list.containsKey(licensePlate)) {
            list.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate licensePlate : list.keySet()) {
            System.out.println(licensePlate);
        }
    }

    public void printOwners() {
        ArrayList<String> printed = new ArrayList<>();
        for (String owner : list.values()) {
            if(!printed.contains(owner)){
                System.out.println(owner);
                printed.add(owner);
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.list);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehicleRegistry other = (VehicleRegistry) obj;
        if (!Objects.equals(this.list, other.list)) {
            return false;
        }
        return true;
    }

}
