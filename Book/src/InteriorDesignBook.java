public class InteriorDesignBook extends DesignBook {
    private String designStyle;
    private String roomFocus;
    private String materialPalette;

    public InteriorDesignBook() {}

    public InteriorDesignBook(String title, String author, String designStyle, String roomFocus, String materialPalette) {
        super(title, author);
        this.designStyle = designStyle;
        this.roomFocus = roomFocus;
        this.materialPalette = materialPalette;
    }

    public String getDesignStyle() {
        return designStyle;
    }
    public void setDesignStyle(String designStyle) {
        this.designStyle = designStyle;
    }

    public String getRoomFocus() {
        return roomFocus;
    }
    public void setRoomFocus(String roomFocus) {
        this.roomFocus = roomFocus;
    }

    public String getMaterialPalette() {
        return materialPalette;
    }
    public void setMaterialPalette(String materialPalette) {
        this.materialPalette = materialPalette;
    }

    @Override
    public String toString() {
        return "InteriorDesignBook{" +
                "title=" + getTitle() +
                ", author=" + getAuthor() +
                ", style='" + designStyle + '\'' +
                ", room='" + roomFocus + '\'' +
                ", palette='" + materialPalette + '\'' +
                '}';
    }
}
