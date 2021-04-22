
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> search = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        try (Scanner scannersearch = new Scanner(Paths.get(file))) {
            while (scannersearch.hasNextLine()) {
                String row = scannersearch.nextLine();
                search.add(row);
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
        
        if (search.contains(searchedFor)) {
            System.out.println("Found!");
        } else {
            System.out.println("Not found.");
        }
    }
}
