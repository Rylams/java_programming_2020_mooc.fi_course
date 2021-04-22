
/**
 *
 * @author pedromaia
 */
public class Counter {
    private int value;
    
    public Counter() {
        this(0);
    }
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void increase(int number) {
        if(number < 0) {
            return;
        }
        value += number;
    }
    
    public void decrease() {
        this.decrease(1);
    }
    
    public void decrease(int number) {
        if(number < 0) {
            return;
        }
        value -= number;
    }
    
    public int value() {
        return value;
    }
}
