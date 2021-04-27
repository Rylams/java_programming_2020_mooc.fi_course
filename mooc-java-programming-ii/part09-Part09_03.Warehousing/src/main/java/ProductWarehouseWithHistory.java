
/**
 *
 * @author pedromaia
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        addToWarehouse(initialBalance);
    }

    public void printAnalysis() {
        System.out.println("Product: " + super.getName() + "\n"
                        + "History: " + history.toString() + "\n"
                        + "Largest amount of product: " + history.maxValue() + "\n"
                        + "Smallest amount of product: " + history.minValue() + "\n"
                        + "Average: " + history.average());
    }
    
    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        history.add(super.getBalance());
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        amount = super.takeFromWarehouse(amount);
        history.add(super.getBalance());
        return amount;
    }

    public String history() {
        return history.toString();
    }
}
