
import java.util.ArrayList;

public class Smoothie {
    String name;
    ArrayList<String> ingredients;

    public Smoothie(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(String ingredient) {
        this.ingredients.remove(ingredient);
    }
}