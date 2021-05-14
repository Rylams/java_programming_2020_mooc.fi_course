/**
 *
 * @author pedromaia
 * @param <T>
 */
public class Hideout<T> {
    private T value;
    
    public void putIntoHideout(T toHide) {
        if(value == toHide) {
            value = null;
            return;
        }
        value = toHide;
    }
    
    public T takeFromHideout() {
        T valueTo = value;
        value = null;
        return valueTo;
    }
    
    public boolean isInHideout() {
        return value == null;
    }
}
