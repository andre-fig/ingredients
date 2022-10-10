public class Order {
    String order;
    Smoothie smoothie;

    public Order (String order){
        this.order = order;
    }

    public Stock getStock() {
        return new Stock();
    }

    public Smoothie getSmoothie() {
        String[] orderInstructions = this.order.split(",");

        switch(orderInstructions[0]){
            case "Classic":
                smoothie = new Classic();
                break;
            case "Freezie":
                smoothie = new Freezie();
                break;
            case "Greenie":
                smoothie = new Greenie();
                break;
            case "Just Desserts":
                smoothie = new JustDesserts();
                break;
            default:
                throw new IllegalArgumentException();
        }

        for (int i = 1; i < orderInstructions.length; i++) {
            if (orderInstructions[i].startsWith("-")){
                smoothie.removeIngredient(orderInstructions[i].substring(1));
            } else if (smoothie.ingredients.contains(orderInstructions[i])){
                throw new IllegalArgumentException();
            } else if (getStock().hasIngredient(orderInstructions[i])){
                smoothie.addIngredient(orderInstructions[i]);
            } else {
                throw new IllegalArgumentException();
            }
            
            }
        return smoothie;
}
}
