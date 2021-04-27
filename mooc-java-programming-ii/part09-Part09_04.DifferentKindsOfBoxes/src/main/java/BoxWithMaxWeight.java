
import java.util.ArrayList;

/**
 *
 * @author pedromaia
 */
public class BoxWithMaxWeight extends Box {

    private final int maxWeight;
    private int weight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.weight = 0;
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (!(item.getWeight() + weight > maxWeight)) {
            items.add(item);
            weight += item.getWeight();
        }
    }
    
    @Override
    public void add(ArrayList<Item> items) {
        for (Item item : items) {
            this.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item unit: items) {
            if(unit.equals(item)) {
                return true;
            }
        }
        return false;
    }
}
