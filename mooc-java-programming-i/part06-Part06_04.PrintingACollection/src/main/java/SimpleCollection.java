
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    @Override
    public String toString() {
        String printOutput1 = "The collection " + this.name + " has " + elements.size() + " elements:\n";
        
        String printOutput2 = "The collection " + this.name + " has " + elements.size() + " element:\n";
        
        if (elements.isEmpty()) {
            return "The collection " + this.name +  " is empty.";
        }
        
        String elementsOfCollection = "";
        
        int i = 0;
        int s = this.elements.size();
        
        for(String element: elements) {
            if(i < s - 1) {
            elementsOfCollection += element + "\n";
            } else {
                elementsOfCollection += element;
            }
        }
        
        if(elements.size() == 1) {
            return printOutput2 + elementsOfCollection;
        }
        
        return printOutput1 + elementsOfCollection;
    }
    
}
