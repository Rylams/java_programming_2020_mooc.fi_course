/**
 *
 * @author pedromaia
 */
public class CustomTacoBox implements TacoBox{
    private int tacos;
    
    public CustomTacoBox(int initialTacos) {
        this.tacos = initialTacos;
    }

    @Override
    public void eat() {
        tacos--;
        if(tacos < 0) {
            tacos = 0;
        }
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }
    
    
}
