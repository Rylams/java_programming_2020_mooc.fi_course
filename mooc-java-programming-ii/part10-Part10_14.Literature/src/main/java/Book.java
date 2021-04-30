
/**
 *
 * @author pedromaia
 */
public class Book {
    private String name;
    private int age;
    
    public Book(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + age + " year-olds or older)";
    }
}
