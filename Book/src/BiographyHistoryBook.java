public class BiographyHistoryBook extends HistoryBook {
    private String subjectPerson;
    private String historicalPeriod;
    private String primarySourceExcerpts;

    public BiographyHistoryBook() {}

    public BiographyHistoryBook(String title, String author, String subjectPerson, String historicalPeriod, String primarySourceExcerpts) {
        super(title, author);
        this.subjectPerson = subjectPerson;
        this.historicalPeriod = historicalPeriod;
        this.primarySourceExcerpts = primarySourceExcerpts;
    }

    public String getSubjectPerson() {
        return subjectPerson;
    }
    public void setSubjectPerson(String subjectPerson) {
        this.subjectPerson = subjectPerson;
    }

    public String getHistoricalPeriod() {
        return historicalPeriod;
    }
    public void setHistoricalPeriod(String historicalPeriod) {
        this.historicalPeriod = historicalPeriod;
    }

    public String getPrimarySourceExcerpts() {
        return primarySourceExcerpts;
    }
    public void setPrimarySourceExcerpts(String primarySourceExcerpts) {
        this.primarySourceExcerpts = primarySourceExcerpts;
    }

    @Override
    public String toString() {
        return "BiographyHistoryBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", subject='" + subjectPerson + '\'' +
                ", period='" + historicalPeriod + '\'' +
                ", excerpts='" + primarySourceExcerpts + '\'' +
                '}';
    }
}
