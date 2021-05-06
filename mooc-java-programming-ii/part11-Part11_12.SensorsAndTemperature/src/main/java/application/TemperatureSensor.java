package application;
import java.util.Random;

/**
 *
 * @author pedromaia
 */
public class TemperatureSensor implements Sensor{
    private boolean state;
    
    public TemperatureSensor() {
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setOn() {
        state = true;
    }

    @Override
    public void setOff() {
        state = false;
    }

    @Override
    public int read() {
        if(state == false) {
            throw new IllegalStateException("The sensor is off");
        }
        int temp = new Random().nextInt(61);
        return temp - 30;
    }
    
}
