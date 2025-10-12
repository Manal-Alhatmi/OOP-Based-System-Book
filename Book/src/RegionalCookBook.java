public class RegionalCookBook extends CookBook {
    private String cuisineRegion;
    private String culturalContext;
    private String ingredientSourcingGuide;

    public RegionalCookBook() {}

    public RegionalCookBook(String title, String author, String cuisineRegion, String culturalContext, String ingredientSourcingGuide) {
        super(title, author);
        this.cuisineRegion = cuisineRegion;
        this.culturalContext = culturalContext;
        this.ingredientSourcingGuide = ingredientSourcingGuide;
    }

    public String getCuisineRegion() {
        return cuisineRegion;
    }
    public void setCuisineRegion(String cuisineRegion) {
        this.cuisineRegion = cuisineRegion;
    }

    public String getCulturalContext() {
        return culturalContext;
    }
    public void setCulturalContext(String culturalContext) {
        this.culturalContext = culturalContext;
    }

    public String getIngredientSourcingGuide() {
        return ingredientSourcingGuide;
    }
    public void setIngredientSourcingGuide(String ingredientSourcingGuide) {
        this.ingredientSourcingGuide = ingredientSourcingGuide;
    }

    @Override
    public String toString() {
        return "RegionalCookBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", region='" + cuisineRegion + '\'' +
                ", context='" + culturalContext + '\'' +
                ", sourcingGuide='" + ingredientSourcingGuide + '\'' +
                '}';
    }
}

