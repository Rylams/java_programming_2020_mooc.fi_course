
package application;

/**
 *
 * @author pedromaia
 */
public class StandardSensor implements Sensor{
    private int temperature;
    
    public StandardSensor(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        return;
    }

    @Override
    public void setOff() {
        return;
    }

    @Override
    public int read() {
        return temperature;
    }
    
}
