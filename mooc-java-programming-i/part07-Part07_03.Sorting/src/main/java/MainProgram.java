
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int smallest = 0;
        for (int number : array) {
            if (smallest == 0) {
                smallest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = 0;
        int index = -1;
        int findex = 0;
        for (int number : array) {
            if (index == -1) {
                smallest = number;
            }
            index++;
            if (number < smallest) {
                smallest = number;
                findex = index;
            }
        }
        return findex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = -1000;
        int index = -1;
        int findex = 0;
        for (int number : table) {
            index++;
            if (smallest == -1000) {
                if (index >= startIndex) {
                    smallest = number;
                }
            }

            if (number <= smallest) {
                if (index >= startIndex) {
                    smallest = number;
                    findex = index;
                }
            }
        }
        return findex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int value1 = 0;
        int value2 = 0;
        int index = 0;
        for (int number : array) {
            if (index == index1) {
                value1 = number;
            }
            if (index == index2) {
                value2 = number;
            }
            index++;
        }
        array[index1] = value2;
        array[index2] = value1;
    }

    public static void sort(int[] array) {
        int sorting = 0;
        while (sorting < array.length) {
            int maxIndex = MainProgram.indexOfSmallestFrom(array, sorting);
            MainProgram.swap(array, sorting, maxIndex);
            sorting++;
            System.out.println(Arrays.toString(array));
        }
    }
}
