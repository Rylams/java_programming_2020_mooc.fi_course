
public class HealthStation {
    private int weighings;

    public int weigh(Person person) {
        int weight = person.getWeight();
        weighings++;
        return weight;
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int weighings() {
        return weighings;
    }

}
