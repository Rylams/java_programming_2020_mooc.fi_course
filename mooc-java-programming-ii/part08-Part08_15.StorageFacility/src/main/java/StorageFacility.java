
/**
 *
 * @author pedromaia
 */

import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String,ArrayList<String>> storage;

    public StorageFacility() {
        storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());

        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (storage.containsKey(storageUnit)) {
            return storage.get(storageUnit);
        }
        return new ArrayList<String>();
    }

    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsWithItems = new ArrayList<>();
        for (String unit : storage.keySet()) {
            if(!storage.get(unit).isEmpty()) {
                unitsWithItems.add(unit);
            }
        }
        return unitsWithItems;
    }
}
