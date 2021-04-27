
/**
 *
 * @author pedromaia
 */
public class CD implements Packable {

    private String author;
    private String name;
    private int year;
    private double weight;

    public CD(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return author + ": " + name + " (" + year + ")";
    }
}
