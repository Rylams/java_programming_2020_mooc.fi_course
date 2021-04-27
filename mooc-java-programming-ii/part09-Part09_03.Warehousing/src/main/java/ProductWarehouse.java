
/**
 *
 * @author pedromaia
 */
public class ProductWarehouse extends Warehouse {

    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ": " + super.toString(); 
    }
}
