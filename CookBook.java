public class Cookbook {

    private String cuisineType;
    private int numberOfRecipes;
    private boolean hasNutritionalInfo;

    public Cookbook() {
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public int getNumberOfRecipes() {
        return numberOfRecipes;
    }

    public void setNumberOfRecipes(int numberOfRecipes) {
        this.numberOfRecipes = numberOfRecipes;
    }

    public boolean isHasNutritionalInfo() {
        return hasNutritionalInfo;
    }

    public void setHasNutritionalInfo(boolean hasNutritionalInfo) {
        this.hasNutritionalInfo = hasNutritionalInfo;
    }
}