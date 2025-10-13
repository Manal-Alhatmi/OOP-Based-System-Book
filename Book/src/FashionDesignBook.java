public class FashionDesignBook extends DesignBook {
    private String garmentType;
    private String fabricGuide;
    private String illustrationTechnique;

    public FashionDesignBook(String garmentType, String fabricGuide, String illustrationTechnique) {
        this.garmentType = garmentType;
        this.fabricGuide = fabricGuide;
        this.illustrationTechnique = illustrationTechnique;
    }

    public String getGarmentType() {
        return garmentType;
    }
    public void setGarmentType(String garmentType) {
        this.garmentType = garmentType;
    }

    public String getFabricGuide() {
        return fabricGuide;
    }
    public void setFabricGuide(String fabricGuide) {
        this.fabricGuide = fabricGuide;
    }

    public String getIllustrationTechnique() {
        return illustrationTechnique;
    }
    public void setIllustrationTechnique(String illustrationTechnique) {
        this.illustrationTechnique = illustrationTechnique;
    }

    @Override
    public String toString() {
        return "FashionDesignBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", garmentType='" + garmentType + '\'' +
                ", fabricGuide='" + fabricGuide + '\'' +
                ", illustrationTechnique='" + illustrationTechnique + '\'' +
                '}';
    }
}

