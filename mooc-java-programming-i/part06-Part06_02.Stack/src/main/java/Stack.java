import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stacks;
    
    public Stack() {
        this.stacks = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return stacks.isEmpty();
    }
    
    public void add(String value) {
        this.stacks.add(value);
    }
    
    public ArrayList<String> values() {
       return stacks;
    }
    
    public String take() {
        String value = stacks.get(stacks.size() - 1);
        stacks.remove(stacks.size() - 1);
        return value;
    }
}
