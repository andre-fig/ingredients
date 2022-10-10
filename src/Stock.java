
import java.util.ArrayList;

public class Stock {
    private ArrayList<Ingredient> ingredients;

    public Stock() {
        this.ingredients = new ArrayList<>();
        this.ingredients.add(new Ingredient("strawberry"));
        this.ingredients.add(new Ingredient("banana"));
        this.ingredients.add(new Ingredient("pineapple"));
        this.ingredients.add(new Ingredient("Coconut"));
        this.ingredients.add(new Ingredient("mango"));
        this.ingredients.add(new Ingredient("peach"));
        this.ingredients.add(new Ingredient("honey"));
        this.ingredients.add(new Ingredient("blackberry"));
        this.ingredients.add(new Ingredient("black currant"));
        this.ingredients.add(new Ingredient("grape juice"));
        this.ingredients.add(new Ingredient("frozen yogurt")); //
        this.ingredients.add(new Ingredient("green apple"));
        this.ingredients.add(new Ingredient("lime"));
        this.ingredients.add(new Ingredient("avocado"));
        this.ingredients.add(new Ingredient("spinach"));
        this.ingredients.add(new Ingredient("ice"));
        this.ingredients.add(new Ingredient("apple juice"));
        this.ingredients.add(new Ingredient("ice cream"));
        this.ingredients.add(new Ingredient("chocolate"));
        this.ingredients.add(new Ingredient("peanut"));
        this.ingredients.add(new Ingredient("cherry"));
    }

    public boolean hasIngredient(String name) {
        for (Ingredient ingredient : this.ingredients) {
            if (ingredient.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}