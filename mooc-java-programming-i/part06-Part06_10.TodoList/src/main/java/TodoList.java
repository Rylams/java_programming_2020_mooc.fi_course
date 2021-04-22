import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;
    
    public TodoList() {
        list = new ArrayList<>();
    }
    
    public void add(String task) {
        list.add(task);
    }
    
    public void print() {
        int i = 0;
        
        for(String item: list) {
            i++;
            System.out.println(i+ ": " + item);
        }
    }
    
    public void remove(int number) {
        list.remove(number - 1);
    }
}
