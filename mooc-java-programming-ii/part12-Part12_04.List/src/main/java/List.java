
/**
 *
 * @author pedromaia
 * @param <T>
 */
public class List<T> {

    private T[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (T[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(T value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[this.firstFreeIndex] = value;
        this.firstFreeIndex++;
    }

    public boolean contains(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.firstFreeIndex--;
    }

    private int indexOfValue(T value) {
        for (int i = 0; i < this.firstFreeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.firstFreeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public void grow() {
        int newSize = this.values.length + this.values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < this.values.length; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }
}
