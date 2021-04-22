
import java.util.ArrayList;

public class GradeStars {
    ArrayList<Integer> gradeList;
    
    public GradeStars() {
        this.gradeList = new ArrayList<>();
    }
    
    public void printStar() {
        System.out.print("*");
    }
    
    public void addStars(Grades grades) {
        System.out.println("");
        ArrayList<Integer> distri = grades.gradeDistribution();
        System.out.print("5:");
        for(int i = 0; i < distri.get(0);i++) {
            this.printStar();
        }
        System.out.println("");
        System.out.print("4:");
        for(int i = 0; i < distri.get(1);i++) {
            this.printStar();
        }
        System.out.print("3:");
        System.out.println("");
        for(int i = 0; i < distri.get(2);i++) {
            this.printStar();
        }
        System.out.print("2:");
        System.out.println("");
        for(int i = 0; i < distri.get(3);i++) {
            this.printStar();
        }
        System.out.print("1:");
        System.out.println("");
        for(int i = 0; i < distri.get(4);i++) {
            this.printStar();
        }
        System.out.print("0:");
        for(int i = 0; i < distri.get(5);i++) {
            this.printStar();
        }
    }
     
}
