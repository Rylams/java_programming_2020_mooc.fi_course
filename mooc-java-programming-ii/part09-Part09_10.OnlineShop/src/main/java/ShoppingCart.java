
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedromaia
 */
public class ShoppingCart {

    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void add(String product, int price) {
        if (cart.contains(new Item(product, 1, price))) {
            cart.get(getIndex(new Item(product, 1, price))).increaseQuantity();
        } else {
            cart.add(new Item(product, 1, price));
        }
    }

    public int getIndex(Item queryItem) {
        int index = -1;
        for (Item item : cart) {
            index++;
            if (item.equals(queryItem)) {
                return index;
            }
        }
        return -1;
    }

    public int price() {
        int price = 0;
        for (Item item : cart) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : cart) {
            System.out.println(item.toString());
        }
    }

}
