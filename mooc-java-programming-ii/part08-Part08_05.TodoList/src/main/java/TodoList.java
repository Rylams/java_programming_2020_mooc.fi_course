
/**
 *
 * @author pedromaia
 */

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        int i = 1;
        for(String task: list) {
            System.out.println(i + ": " + task);
            i++;
        }
    }
    
    public void remove(int n) {
        n -= 1;
        list.remove(n);
    }

}
