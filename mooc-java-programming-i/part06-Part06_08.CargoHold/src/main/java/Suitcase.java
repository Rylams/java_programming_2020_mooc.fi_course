
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int weight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (item.getWeight() + this.getWeight() <= maxWeight) {
            this.items.add(item);
            weight += item.getWeight();
        }
    }

    public int getWeight() {
        return weight;
    }
    
    public void printItems() {
        for(Item item: items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        return weight;
    }
    
    public Item heaviestItem() {
        if(items.isEmpty()) {
            return null;
        }
        
        Item heaviest = null;
        for(Item item: items) {
            if(heaviest == null) {
                heaviest = item;
            } 
            if(item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
 
    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if(items.size() == 1) {
            return items.size() + " item (" + this.getWeight() + " kg)";
        } else {
            return items.size() + " items (" + this.getWeight() + " kg)";
        }
    }
}
