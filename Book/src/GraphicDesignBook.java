public class GraphicDesignBook extends DesignBook {
    private String typographyFocus;
    private String colorTheorySection;
    private String softwareTutorialsIncluded;

    public GraphicDesignBook(String typographyFocus, String colorTheorySection, String softwareTutorialsIncluded) {
        this.typographyFocus = typographyFocus;
        this.colorTheorySection = colorTheorySection;
        this.softwareTutorialsIncluded = softwareTutorialsIncluded;
    }

    public String getTypographyFocus() {
        return typographyFocus;
    }
    public void setTypographyFocus(String typographyFocus) {
        this.typographyFocus = typographyFocus;
    }

    public String getColorTheorySection() {
        return colorTheorySection;
    }
    public void setColorTheorySection(String colorTheorySection) {
        this.colorTheorySection = colorTheorySection;
    }

    public String getSoftwareTutorialsIncluded() {
        return softwareTutorialsIncluded;
    }
    public void setSoftwareTutorialsIncluded(String softwareTutorialsIncluded) {
        this.softwareTutorialsIncluded = softwareTutorialsIncluded;
    }

    @Override
    public String toString() {
        return "GraphicDesignBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", typography='" + typographyFocus + '\'' +
                ", colorTheory='" + colorTheorySection + '\'' +
                ", tutorials='" + softwareTutorialsIncluded + '\'' +
                '}';
    }
}
