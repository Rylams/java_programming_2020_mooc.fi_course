/**
 *
 * @author pedromaia
 */

import java.util.HashMap;

public class IOU {
    private HashMap<String,Double> list;
    
    public IOU() {
        this.list = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        if(list.containsKey(toWhom)) {
            amount += list.get(toWhom);
            list.put(toWhom, amount);
            return;
        }
        list.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        return list.getOrDefault(toWhom, 0.0);
    }
}
