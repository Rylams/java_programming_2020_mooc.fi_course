
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
    
    @Override
    public boolean equals(Object compare) {
        if(this == compare) {
            return true;
        }
        
        if(!(compare instanceof Object)) {
        return false;
        }
        
        Person comparedPerson = (Person) compare;
        
        if(this.name.equals(comparedPerson.getName()) &&
           this.birthday.equals(comparedPerson.getBirthday()) &&
           this.height == comparedPerson.getHeight() &&
           this.weight == comparedPerson.getWeight()) {
            return true;
        }
        
        return false;
    }

    // implement an equals method here for checking the equality of objects
}
