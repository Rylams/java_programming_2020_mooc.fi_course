/**
 *
 * @author pedromaia
 */

import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public String print() {
        String toPrint = "";
        for(Movable movable: herd) {
            toPrint += movable + "\n";
        }
        return toPrint;
    }
    
    @Override
    public void move(int dx, int dy) {
        for(Movable movable: herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        return this.print();
    }
}
