public class BakingCookBook extends CookBook {
    private String bakingTechnique;
    private String difficultyLevel;
    private String yeastType;

    public BakingCookBook(String cuisineType, int numberOfRecipes, boolean hasNutritionalInfo, String bakingTechnique, String difficultyLevel, String yeastType) {
        super(cuisineType, numberOfRecipes, hasNutritionalInfo);
        this.bakingTechnique = bakingTechnique;
        this.difficultyLevel = difficultyLevel;
        this.yeastType = yeastType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getYeastType() {
        return yeastType;
    }

    public void setYeastType(String yeastType) {
        this.yeastType = yeastType;
    }

    @Override
    public String toString() {
        return "BakingCookBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", technique='" + bakingTechnique + '\'' +
                ", level='" + difficultyLevel + '\'' +
                ", yeast='" + yeastType + '\'' +
                '}';
    }
}

