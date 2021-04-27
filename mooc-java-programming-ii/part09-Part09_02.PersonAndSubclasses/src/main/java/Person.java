
/**
 *
 * @author pedromaia
 */
public class Person {

    private final String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + "\n  " + address;
    }
}
