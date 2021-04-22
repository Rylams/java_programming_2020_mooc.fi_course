
import java.util.ArrayList;

public class Grades {
    private double passing = 0;
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);
            if (grade >= 50) {
                passing++;
            }
        }
    }

    public double getAverage() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        double average = sum / this.grades.size();
        return average;
    }

    public double getAveragePassing() {
        double sum = 0;
        for (Integer grade : grades) {
            if (grade >= 50) {
                sum += grade;
            }
        }
        double average = sum / passing;
        return average;
    }
    
    public double passPercentage() {
        double percentage = 100 * passing/this.grades.size();
        return percentage;
    }
    
    public ArrayList<Integer> gradeDistribution() {
        ArrayList<Integer> distri = new ArrayList<>();
        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        for(Integer grade: grades) {
            if(grade < 50) {
                zero++;
            } else if(grade < 60) {
                one++;
            } else if(grade < 70) {
                two++;
            } else if(grade < 80) {
                three++;
            } else if(grade < 90) {
                four++;
            } else if(grade >= 90) {
                five++;
            }
        }
        distri.add(five);
        distri.add(four);
        distri.add(three);
        distri.add(two);
        distri.add(one);
        distri.add(zero);
        
        return distri;
    }
    
    public void printStar() {
        System.out.print("*");
    }
    
    public void addStars() {
        ArrayList<Integer> distri = this.gradeDistribution();
        System.out.print("5:");
        for(int i = 0; i < distri.get(0);i++) {
            this.printStar();
        }
        System.out.println("");
        System.out.print("4:");
        for(int i = 0; i < distri.get(1);i++) {
            this.printStar();
        }
        System.out.println("");
        System.out.print("3:");
        for(int i = 0; i < distri.get(2);i++) {
            this.printStar();
        }
        System.out.println("");
        System.out.print("2:");
        for(int i = 0; i < distri.get(3);i++) {
            this.printStar();
        }
        System.out.println("");
        System.out.print("1:");
        for(int i = 0; i < distri.get(4);i++) {
            this.printStar();
        }
        System.out.println("");
        System.out.print("0:");
        for(int i = 0; i < distri.get(5);i++) {
            this.printStar();
        }
    }
}
