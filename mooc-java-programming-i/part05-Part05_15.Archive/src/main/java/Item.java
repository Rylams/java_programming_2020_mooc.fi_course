
public class Item {
    private String name;
    private String id;
    
    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public boolean equals(Object compared) {
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Object)) {
            return false;
        }
        
        Item itemCompared = (Item) compared;
        
        return this.id.equals(itemCompared.getId());
    }
}
