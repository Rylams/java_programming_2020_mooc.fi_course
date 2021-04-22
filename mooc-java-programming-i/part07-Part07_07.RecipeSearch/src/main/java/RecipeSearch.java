
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.CharSequence;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (true) {
                String name = fileScanner.nextLine();
                int time = Integer.valueOf(fileScanner.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (fileScanner.hasNextLine()) {
                    String row = fileScanner.nextLine();
                    if (row.isEmpty()) {
                        break;
                    }
                    ingredients.add(row);
                }
                recipes.add(new Recipe(name, time, ingredients));
                if (!(fileScanner.hasNextLine())) {
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("");
        System.out.println("Commands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name");

        while (true) {
            System.out.println("Enter command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                for (Recipe recipe : recipes) {
                    System.out.println(recipe.toString());
                }
            }

            if (command.equals("find name")) {
                System.out.println("Searched word:");
                String searchedWord = scanner.nextLine();

                for (Recipe recipe : recipes) {
                    if (recipe.getName().contains(searchedWord)) {
                        System.out.println(recipe);
                    }
                }
            }
            
            
            if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int query = Integer.valueOf(scanner.nextLine());

                for (Recipe recipe : recipes) {
                    if (recipe.getTime() <= query) {
                        System.out.println(recipe);
                    }
                }
            }
            
            if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingQuery = scanner.nextLine();
                
                for(Recipe recipe: recipes) {
                    if(recipe.containIngredients(ingQuery)) {
                        System.out.println(recipe);
                    }
                }
            }
        }

    }

}
