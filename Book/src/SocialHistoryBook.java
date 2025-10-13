public class SocialHistoryBook extends HistoryBook {
    private String focusPopulation;
    private String eraOfStudy;
    private String culturalArtifactsDiscussed;

    public SocialHistoryBook(String focusPopulation, String eraOfStudy, String culturalArtifactsDiscussed) {
        this.focusPopulation = focusPopulation;
        this.eraOfStudy = eraOfStudy;
        this.culturalArtifactsDiscussed = culturalArtifactsDiscussed;
    }

    public String getFocusPopulation() {
        return focusPopulation;
    }
    public void setFocusPopulation(String focusPopulation) {
        this.focusPopulation = focusPopulation;
    }

    public String getEraOfStudy() {
        return eraOfStudy;
    }
    public void setEraOfStudy(String eraOfStudy) {
        this.eraOfStudy = eraOfStudy;
    }

    public String getCulturalArtifactsDiscussed() {
        return culturalArtifactsDiscussed;
    }
    public void setCulturalArtifactsDiscussed(String culturalArtifactsDiscussed) {
        this.culturalArtifactsDiscussed = culturalArtifactsDiscussed;
    }

    @Override
    public String toString() {
        return "SocialHistoryBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", population='" + focusPopulation + '\'' +
                ", era='" + eraOfStudy + '\'' +
                ", artifacts='" + culturalArtifactsDiscussed + '\'' +
                '}';
    }
}
