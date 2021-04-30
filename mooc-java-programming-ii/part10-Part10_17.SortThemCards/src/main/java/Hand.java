
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author pedromaia
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> list;

    public Hand() {
        this.list = new ArrayList<>();
    }

    public void add(Card card) {
        list.add(card);
    }

    public void print() {
        list.stream()
                .forEach(value -> System.out.println(value));
    }

    public int sumValues() {
        int sum;
        sum = list.stream()
                .map(value -> value.getValue())
                .reduce(0, Integer::sum);

        return sum;
    }

    @Override
    public int compareTo(Hand t) {
        return this.sumValues() - t.sumValues();
    }

    public void sort() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getValue)
                .thenComparing(Card::getSuitOrdinal);

        Collections.sort(list, comparator);
    }
    
    public void sortBySuit() {
        Comparator<Card> comparator = Comparator
                .comparing(Card::getSuitOrdinal)
                .thenComparing(Card::getValue);

        Collections.sort(list, comparator);
    }
}
