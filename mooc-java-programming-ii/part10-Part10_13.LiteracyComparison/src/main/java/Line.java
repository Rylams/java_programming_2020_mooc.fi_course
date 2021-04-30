/**
 *
 * @author pedromaia
 */
public class Line implements Comparable<Line>{
    private String country;
    private int year;
    private String gender;
    private double percent;
    
    public Line(String country, String year, String gender, String percent) {
        this.country = country;
        this.year = Integer.valueOf(year);
        if(gender.contains("female")) {
            this.gender = "female";
        } else {
            this.gender = "male";
        }
        this.percent = Double.valueOf(percent);
    }

    @Override
    public int compareTo(Line t) {
        if(percent < t.getPercent()) return -1;
        if(percent > t.getPercent()) return 1;
        return 0;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + percent;
    }
}
