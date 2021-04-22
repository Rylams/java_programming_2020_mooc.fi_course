
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner scannersearch = new Scanner(Paths.get(file))) {
            while (scannersearch.hasNextLine()) {
                String row = scannersearch.nextLine();
                String[] parts = row.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                String ageSet = "";
                if (age != 1) {
                    ageSet = age + " years";
                } else {
                    ageSet = age + " year";
                }
                
                System.out.println(name + ", age: " + ageSet);
            }
        } catch (Exception e) {
            
        }
    }
}
