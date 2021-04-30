
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Line> list = new ArrayList<>();
        
        try { Files.lines(Paths.get("literacy.csv"))
                .map(value -> value.split(","))
                .map(value -> new Line(value[3], value[4], value[2], value[5]))
                .forEach(value -> list.add(value));
                Collections.sort(list, (p1, p2) -> p1.compareTo(p2));
                list.stream().forEach(value -> System.out.println(value.toString()));
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

    }
}
