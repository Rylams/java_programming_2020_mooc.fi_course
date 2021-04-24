/**
 *
 * @author pedromaia
 */

import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> list;
    
    public Abbreviations() {
        this.list = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation) {
        list.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation) {
        return list.containsKey(abbreviation);
    }
    
    public String findExplanationFor(String abbreviation) {
        return list.get(abbreviation);
    }
}
