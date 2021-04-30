
/**
 *
 * @author pedromaia
 */
public class Person {
    private String name;
    private Education edu;
    
    public Person(String name, Education edu) {
        this.edu = edu;
        this.name = name;
    }

    public Education getEducation() {
        return edu;
    }

    @Override
    public String toString() {
        return name + ", " + edu;
    }
}
