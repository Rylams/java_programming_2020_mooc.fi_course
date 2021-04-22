
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person) {
        persons.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
    
    public Person shortest() {
        Person shortest = null;
        
        for(Person person: persons) {
            if(shortest == null) {
                shortest = person;
            }
            if(person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        
        return shortest;
    }
    
    public Person take() {
        if(persons.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();
        persons.remove(this.shortest());
        
        return shortestPerson;
    }
}

/* String personsList = "";
        
        int i = 0;
        int s = this.persons.size();
        
        for(Person person: persons) {
            if(i > s - 1) {
                personsList += person.getName() + " (" + person.getHeight() + ")\n";
            } else {
                personsList += person.getName() + " (" + person.getHeight() + ")";
            }
        }
        */