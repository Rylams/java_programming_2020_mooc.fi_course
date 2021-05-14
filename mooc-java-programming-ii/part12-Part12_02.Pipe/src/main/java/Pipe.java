
import java.util.ArrayList;

/**
 *
 * @author pedromaia
 * @param <T>
 */
public class Pipe<T> {
    private ArrayList<T> values;
    
    public Pipe() {
        values = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        this.values.add(value);
    }
    
    public T takeFromPipe() {
        T toReturn = values.get(0);
        values.remove(0);
        return toReturn;
    }
    
    public boolean isInPipe() {
        return values.isEmpty();
    }
}
