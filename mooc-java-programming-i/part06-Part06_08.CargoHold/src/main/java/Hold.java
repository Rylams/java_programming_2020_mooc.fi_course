
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> holds;
    private int weight = 0;

    public Hold(int weight) {
        this.holds = new ArrayList<>();
        this.maxWeight = weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        System.out.println(suitcase.totalWeight());
        if (suitcase.totalWeight() + weight <= this.maxWeight) {
            holds.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        for (Suitcase item : holds) {
            item.printItems();
        }
    }

    @Override
    public String toString() {
        return holds.size() + " suitcases (" + weight + " kg)";
    }

}
