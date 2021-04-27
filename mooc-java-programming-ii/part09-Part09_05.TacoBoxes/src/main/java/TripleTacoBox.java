/**
 *
 * @author pedromaia
 */
public class TripleTacoBox implements TacoBox{
    private int tacos;
    
    public TripleTacoBox() {
        this.tacos = 3;
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
