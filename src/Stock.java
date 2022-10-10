
import java.util.ArrayList;

public class Stock {
    private ArrayList<String> ingredients;

    public Stock() {
        ingredients = new ArrayList<>();
        ingredients.add("strawberry");
        ingredients.add("banana");
        ingredients.add("pineapple");
        ingredients.add("mango");
        ingredients.add("peach");
        ingredients.add("honey");
        ingredients.add("blackberry");
        ingredients.add("blueberry");
        ingredients.add("black currant");
        ingredients.add("grape juice");
        ingredients.add("frozen yogurt");
        ingredients.add("green apple");
        ingredients.add("lime");
        ingredients.add("avocado");
        ingredients.add("spinach");
        ingredients.add("ice");
        ingredients.add("apple juice");
        ingredients.add("ice cream");
        ingredients.add("chocolate");
        ingredients.add("peanut");
        ingredients.add("cherry");
    }

    public boolean hasIngredient(String ingredient) {
        return ingredients.contains(ingredient);
    }    
}