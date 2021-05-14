
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int number = random.nextInt(40) + 1;
            if (containsNumber(number)) {
                do {
                    number = random.nextInt(40) + 1;
                } while (containsNumber(number));
            }
            numbers.add(number);
        }

    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
