public class Recipe {
    String name;
    Ingredients[] ingredients;
    Utensils[] utensils;
    String[] instruction;

    public Recipe(String name, Ingredients[] ingredients, Utensils[] utensils, String[] instruction) {
        this.name = name;
        this.ingredients = ingredients;
        this.utensils = utensils;
        this.instruction = instruction;
    }

    public String getName() {
        return name;
    }

    public Ingredients[] getIngredients() {
        return ingredients;
    }

    public Utensils[] getUtensils() {
        return utensils;
    }

    public String[] getInstruction() {
        return instruction;
    }

    public void updateRecipe(){
        System.out.println("Jokes on You fucker");
    }


}
