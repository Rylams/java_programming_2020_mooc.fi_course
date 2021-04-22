
import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    ArrayList<String> ingredients;
    
    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }
    
    public boolean containIngredients(String query) {
        for(String ingredient: ingredients) {
            if(ingredient.equals(query)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }
    
    
}
