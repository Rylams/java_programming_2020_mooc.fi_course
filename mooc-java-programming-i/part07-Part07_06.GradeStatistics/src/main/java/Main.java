
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int grade = Integer.valueOf(scanner.nextLine());
            
            if (grade == -1) {
                break;
            }
            
            grades.add(grade);
        }
        
        System.out.println("Point average (all): " + grades.getAverage());
        System.out.print("Point average (passing): ");
        if(grades.getAveragePassing() == 0){
        System.out.println("-");
        } else {
            System.out.println(grades.getAveragePassing());
        }
        System.out.println("Pass percentage: " + grades.passPercentage());
        System.out.println("Grade distribution:");
        grades.addStars();
    }
}
