/**
 *
 * @author pedromaia
 */

import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status) {
        this.history.add(status);
    }
    
    public void clear() {
        this.history.clear();
    }
    
    public double maxValue() {
        if(history.isEmpty()) {
            return 0;
        }
        double max = 0;
        for (Double value: history) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
    
    public double minValue() {
        if(history.isEmpty()) {
            return 0;
        }
        double min = 0;
        boolean first = true;
        for (Double value: history) {
            if(first) {
                min = value;
                first = false;
            }
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
    
    public double average() {
        if(history.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (Double value: history) {
            sum += value;
        }
        return sum / history.size();
    }
    
    @Override
    public String toString() {
        return history.toString();
    }
}
