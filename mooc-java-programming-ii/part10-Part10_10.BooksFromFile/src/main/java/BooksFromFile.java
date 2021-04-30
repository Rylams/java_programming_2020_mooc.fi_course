
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file) {
        ArrayList<Book> books = new ArrayList<>();
        try {
            Files.lines(Paths.get(file))
                    .map(value -> value.split(","))
                    .map(value -> new Book(value[0], Integer.valueOf(value[1]), Integer.valueOf(value[2]), value[3]))
                    .forEach(value -> books.add(value));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return books;
    }
}
