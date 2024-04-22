public class Ingredients {
    String name;
    Float amount;
    String unitType;
    Recipe[] recipeAssociation;

    public Ingredients(String name, Float amount, String unitType) {
        this.name = name;
        this.amount = amount;
        this.unitType = unitType;
    }

    public String getName() {
        return name;
    }

    public Float getAmount() {
        return amount;
    }

    public String getUnitType() {
        return unitType;
    }

    public Recipe[] getRecipeAssociation() {
        return recipeAssociation;
    }

    public void setRecipeAssociation(Recipe[] recipeAssociation) {
        this.recipeAssociation = recipeAssociation;
    }
}
