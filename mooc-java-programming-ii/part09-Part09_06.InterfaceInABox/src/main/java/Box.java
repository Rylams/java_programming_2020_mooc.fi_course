
/**
 *
 * @author pedromaia
 */

import java.util.ArrayList;

public class Box implements Packable{
    private ArrayList<Packable> inTheBox;
    private double maxCapacity;
    
    public Box(double maxCapacity) {
        this.inTheBox = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }
    
    public void add(Packable item) {
        if(item.weight() + this.weight() <= maxCapacity) {
            inTheBox.add(item);
        }
    }
    
    @Override
    public double weight() {
        double weight = 0;
        for(Packable item: inTheBox) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + inTheBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
