
/**
 *
 * @author pedromaia
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        if (prices.containsKey(product)) {
            return prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (stock.containsKey(product)) {
            return stock.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (stock.containsKey(product)) {
            if (stock.get(product) > 0) {
                int takeProduct = stock.get(product) - 1;
                stock.replace(product, takeProduct);
                return true;
            }
            return false;
        }
        return false;
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<String>();
        for(String product: stock.keySet()) {
            products.add(product);
        }
        return products;
    }

}
