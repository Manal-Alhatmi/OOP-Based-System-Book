public class QuickMealsCookBook extends CookBook {
    private int maxPreparationTime;
    private String mealType;
    private String caloricInformation;

    public QuickMealsCookBook() {}

    public QuickMealsCookBook(String title, String author, int maxPreparationTime, String mealType, String caloricInformation) {
        super(title, author);
        this.maxPreparationTime = maxPreparationTime;
        this.mealType = mealType;
        this.caloricInformation = caloricInformation;
    }

    public int getMaxPreparationTime() {
        return maxPreparationTime;
    }
    public void setMaxPreparationTime(int maxPreparationTime) {
        this.maxPreparationTime = maxPreparationTime;
    }

    public String getMealType() {
        return mealType;
    }
    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public String getCaloricInformation() {
        return caloricInformation;
    }
    public void setCaloricInformation(String caloricInformation) {
        this.caloricInformation = caloricInformation;
    }

    @Override
    public String toString() {
        return "QuickMealsCookBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", maxPrepTime=" + maxPreparationTime +
                ", mealType='" + mealType + '\'' +
                ", calories='" + caloricInformation + '\'' +
                '}';
    }
}

