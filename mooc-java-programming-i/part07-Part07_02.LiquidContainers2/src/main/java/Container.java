
public class Container {
    
    private int content;
    
    public Container() {
        this.content = 0;
    }
    
    public int contains() {
        return content;
    }
    
    public void add(int amount) {
        if(amount < 0) {
            return;
        }
        if(this.content + amount > 100) {
            this.content = 100;
            return;
        }
        this.content += amount;
    }
    
    public void remove(int amount) {
        if(amount < 0) {
            return;
        }
        content -= amount;
        if(this.content < 0) {
            this.content = 0;
        }
    }

    public int getContent() {
        return content;
    }
    
    @Override
    public String toString() {
        return this.content + "/100";
    }
}
