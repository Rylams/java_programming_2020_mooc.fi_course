/**
 *
 * @author pedromaia
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    ArrayList<Person> list;
    
    public Employees() {
        this.list = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.list.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream()
                .forEach(value -> list.add(value));
    }
    
    public void print() {
        list.stream()
                .forEach(value -> System.out.println(value)); 
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if(nextPerson.getEducation() == education) {
                System.out.println(nextPerson);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = list.iterator();
        
        while (iterator.hasNext()) {
            if(iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
