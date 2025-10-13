public class MilitaryHistoryBook extends HistoryBook {
    private String conflictFocus;
    private String battleAnalysisSection;
    private String strategicMaps;

    public MilitaryHistoryBook(String conflictFocus, String battleAnalysisSection, String strategicMaps) {
        this.conflictFocus = conflictFocus;
        this.battleAnalysisSection = battleAnalysisSection;
        this.strategicMaps = strategicMaps;
    }

    public String getConflictFocus() {
        return conflictFocus;
    }
    public void setConflictFocus(String conflictFocus) {
        this.conflictFocus = conflictFocus;
    }

    public String getBattleAnalysisSection() {
        return battleAnalysisSection;
    }
    public void setBattleAnalysisSection(String battleAnalysisSection) {
        this.battleAnalysisSection = battleAnalysisSection;
    }

    public String getStrategicMaps() {
        return strategicMaps;
    }
    public void setStrategicMaps(String strategicMaps) {
        this.strategicMaps = strategicMaps;
    }

    @Override
    public String toString() {
        return "MilitaryHistoryBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", conflict='" + conflictFocus + '\'' +
                ", analysis='" + battleAnalysisSection + '\'' +
                ", maps='" + strategicMaps + '\'' +
                '}';
    }
}

