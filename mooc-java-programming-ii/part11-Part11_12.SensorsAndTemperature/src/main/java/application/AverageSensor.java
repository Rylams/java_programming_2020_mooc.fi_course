package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedromaia
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor() {
        sensors = new ArrayList<>();
        readings = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }
    
    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor: sensors) {
            if(sensor.isOn()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
        for(Sensor sensor: sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for(Sensor sensor: sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(!isOn() || sensors.isEmpty()) {
            throw new IllegalStateException("Error");
        }
        int total = 0;
        for(Sensor sensor: sensors) {
            total += sensor.read();
        }
        readings.add(total / sensors.size());
        return total / sensors.size();
    }
    
}
