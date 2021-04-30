/**
 *
 * @author pedromaia
 */

import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{
    @Override
    public int compare(Card c1, Card c2) {
        if(c1.getSuitOrdinal() < c2.getSuitOrdinal()) return -1;
        if(c1.getSuitOrdinal() > c2.getSuitOrdinal()) return 1;
        if(c1.getValue() < c2.getValue()) return -1;
        if(c1.getValue() > c2.getValue()) return 1;
        return 0;
    }
}
